package br.com;

public class Ball {
    private final long offsetCommitPeriodMs;
    private final int maxRetries;
    private final int maxUncommittedOffsets;
    private final  String firstPollOffsetStrategy;
    private final  String kafkaSpoutStreams;
    private final String tuplesBuilder;
    private final String retryService;
    private final String kafkaProps;
    private final String keyDeserializer;
    private final String valueDeserializer;
    private final String subscribedTopics;
    private final String  topicWildcardPattern;
    private final String  subscription;
    private final String  translator;
    private final String pollTimeoutMs;
    private String finalString;

    public Ball(long offsetCommitPeriodMs, int maxRetries, int maxUncommittedOffsets, String firstPollOffsetStrategy, String kafkaSpoutStreams, String tuplesBuilder, String retryService, String kafkaProps, String keyDeserializer, String valueDeserializer, String subscribedTopics, String topicWildcardPattern) {
        this.offsetCommitPeriodMs = offsetCommitPeriodMs;
        this.maxRetries = maxRetries;
        this.maxUncommittedOffsets = maxUncommittedOffsets;
        this.firstPollOffsetStrategy = firstPollOffsetStrategy;
        this.kafkaSpoutStreams = kafkaSpoutStreams;
        this.tuplesBuilder = tuplesBuilder;
        this.retryService = retryService;
        this.kafkaProps = kafkaProps;
        this.keyDeserializer = keyDeserializer;
        this.valueDeserializer = valueDeserializer;
        this.subscribedTopics = subscribedTopics;
        this.topicWildcardPattern = topicWildcardPattern;
        this.subscription = "";
        this.translator = "";
        this.pollTimeoutMs = "";
        this.finalString = finalString();
    }

    public String getFinalString() {
        return finalString;
    }

    public String getKeyDeserializer() {
        return keyDeserializer;
    }

    public String getValueDeserializer() {
        return valueDeserializer;
    }

    public String getSubscribedTopics() {
        return subscribedTopics;

    }

    public String getTopicWildcardPattern() {
        return topicWildcardPattern;
    }

    public String finalString() {
        String returnString = "KafkaSpoutConfig{" +
                "kafkaProps=" + kafkaProps +
                ", key=" + getKeyDeserializer() +
                ", value=" + getValueDeserializer() +
                ", pollTimeoutMs=" + pollTimeoutMs +
                ", offsetCommitPeriodMs=" + offsetCommitPeriodMs +
                ", maxUncommittedOffsets=" + maxUncommittedOffsets +
                ", firstPollOffsetStrategy=" + firstPollOffsetStrategy +
                ", subscription=" + subscription +
                ", translator=" + translator +
                ", retryService=" + retryService +
                '}';
        return returnString;
    }

}

