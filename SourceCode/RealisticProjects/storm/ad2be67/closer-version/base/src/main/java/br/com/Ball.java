package br.com;

public class Ball {
    private final String kafkaProps;
    private final String keyDeserializer;
    private final String valueDeserializer;
    private final long pollTimeoutMs;
    private final long offsetCommitPeriodMs;
    private final int maxRetries;
    private final int maxUncommittedOffsets;
    private final  String firstPollOffsetStrategy;
    private final  String kafkaSpoutStreams;
    private final String tuplesBuilder;
    private final String retryService;

    public Ball(long offsetCommitPeriodMs, int maxRetries, int maxUncommittedOffsets, String firstPollOffsetStrategy, String kafkaSpoutStreams, String tuplesBuilder, String retryService, String kafkaProps, String keyDeserializer, String valueDeserializer, long pollTimeoutMS) {
        this.kafkaProps = kafkaProps;
        this.keyDeserializer = keyDeserializer;
        this.valueDeserializer = valueDeserializer;
        this.pollTimeoutMs = pollTimeoutMS;
        this.offsetCommitPeriodMs = offsetCommitPeriodMs;
        this.maxRetries = maxRetries;
        this.firstPollOffsetStrategy = firstPollOffsetStrategy;
        this.kafkaSpoutStreams = kafkaSpoutStreams;
        this.maxUncommittedOffsets = maxUncommittedOffsets;
        this.tuplesBuilder = tuplesBuilder;
        this.retryService = retryService;

    }

    public String getSubscribedTopics() {
        return "subscribedTopics";
    }

    public String getTopicWildcardPattern() {
        return "topicWildcardPattern";
    }

    @Override
    public String toString() {
        return "KafkaSpoutConfig{" +
                "kafkaProps=" + kafkaProps +
                ", keyDeserializer=" + keyDeserializer +
                ", valueDeserializer=" + valueDeserializer +
                ", pollTimeoutMs=" + pollTimeoutMs +
                ", offsetCommitPeriodMs=" + offsetCommitPeriodMs +
                ", maxRetries=" + maxRetries +
                ", maxUncommittedOffsets=" + maxUncommittedOffsets +
                ", firstPollOffsetStrategy=" + firstPollOffsetStrategy +
                ", kafkaSpoutStreams=" + kafkaSpoutStreams +
                ", tuplesBuilder=" + tuplesBuilder +
                ", retryService=" + retryService +
                ", topics=" + getSubscribedTopics() +
                ", topicWildcardPattern=" + getTopicWildcardPattern() +
                '}';
    }

}