package retrofit;

import static org.fest.assertions.api.Assertions.assertThat;
import static retrofit.RestMethodInfo.NO_BODY;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

import retrofit.RestMethodInfo.RequestType;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

public class TestConflict {
	
	@Test public void testConflictBase() throws Exception {
		Request request = new Helper() //
		        .setMethod("GET") //
		        .setUrl("http://example.com") //
		        .setPath("/foo/bar/") //
		        .setQuery("=") //
		        .addQueryParam("ping", null) //
		        .build();
			System.out.println(request.getUrl());
			assertThat(request.getMethod()).isEqualTo("GET");
		    assertThat(request.getHeaders()).isEmpty();
		    assertThat(request.getUrl()).isEqualTo("http://example.com/foo/bar/=");
		    assertThat(request.getBody()).isNull();
		    
		    // Output
		    // Base:  http://example.com/foo/bar/=&ping=null
		    //	Left:  http://example.com/foo/bar/=
		    //	Merge: http://example.com/foo/bar/?=
	}
	
}

class Helper {
    private static final Converter GSON = new GsonConverter(new Gson());

    private RequestType requestType = RequestType.SIMPLE;
    private String method;
    private boolean hasBody = false;
    private boolean hasQueryParams = false;
    private String path;
    private String query;
    private final List<String> pathParams = new ArrayList<String>();
    private final List<String> queryParams = new ArrayList<String>();
    private final List<String> fieldParams = new ArrayList<String>();
    private final List<String> partParams = new ArrayList<String>();
    private final List<String> headerParams = new ArrayList<String>();
    private final List<Object> args = new ArrayList<Object>();
    private final List<Header> headers = new ArrayList<Header>();
    private int bodyIndex = NO_BODY;
    private String url;

    Helper setMethod(String method) {
      this.method = method;
      return this;
    }

    Helper setHasBody() {
      hasBody = true;
      return this;
    }

    Helper setUrl(String url) {
      this.url = url;
      return this;
    }

    Helper setPath(String path) {
      this.path = path;
      return this;
    }

    Helper setQuery(String query) {
      this.query = query;
      hasQueryParams = true;
      return this;
    }

    private void addParam(String path, String query, String field, String part, String header,
        Object value) {
      pathParams.add(path);
      queryParams.add(query);
      fieldParams.add(field);
      partParams.add(part);
      headerParams.add(header);
      args.add(value);
    }

    Helper addPathParam(String name, Object value) {
      addParam(name, null, null, null, null, value);
      return this;
    }

    Helper addQueryParam(String name, String value) {
      addParam(null, name, null, null, null, value);
      hasQueryParams = true;
      return this;
    }

    Helper addField(String name, String value) {
      addParam(null, null, name, null, null, value);
      return this;
    }

    Helper addPart(String name, Object value) {
      addParam(null, null, null, name, null, value);
      return this;
    }

    Helper setBody(Object value) {
      addParam(null, null, null, null, null, value);
      bodyIndex = args.size() - 1;
      return this;
    }

    Helper addHeaderParam(String name, Object value) {
      addParam(null, null, null, null, name, value);
      return this;
    }

    Helper addHeader(String name, String value) {
      headers.add(new Header(name, value));
      return this;
    }

    Helper setMultipart() {
      requestType = RequestType.MULTIPART;
      return this;
    }

    Helper setFormEncoded() {
      requestType = RequestType.FORM_URL_ENCODED;
      return this;
    }

    Request build() throws Exception {
      if (method == null) {
        throw new IllegalStateException("Method must be set.");
      }
      if (path == null) {
        throw new IllegalStateException("Path must be set.");
      }

      Method method = getClass().getDeclaredMethod("dummySync");

      RestMethodInfo methodInfo = new RestMethodInfo(method);
      methodInfo.requestMethod = this.method;
      methodInfo.requestHasBody = hasBody;
      methodInfo.requestType = requestType;
      methodInfo.requestUrl = path;
      methodInfo.requestUrlParamNames = RestMethodInfo.parsePathParameters(path);
      methodInfo.requestQuery = query;
      methodInfo.hasQueryParams = hasQueryParams;
      methodInfo.requestUrlParam = pathParams.toArray(new String[pathParams.size()]);
      methodInfo.requestQueryName = queryParams.toArray(new String[queryParams.size()]);
      methodInfo.requestFormFields = fieldParams.toArray(new String[fieldParams.size()]);
      methodInfo.requestMultipartPart = partParams.toArray(new String[partParams.size()]);
      methodInfo.requestParamHeader = headerParams.toArray(new String[headerParams.size()]);
      methodInfo.bodyIndex = bodyIndex;
      methodInfo.loaded = true;

      return new RequestBuilder(GSON) //
          .apiUrl(url)
          .headers(headers)
          .args(args.toArray(new Object[args.size()]))
          .methodInfo(methodInfo)
          .build();
    }

    @SuppressWarnings("UnusedDeclaration") // Accessed via reflection.
    private Object dummySync() {
      return null;
    }
  }

