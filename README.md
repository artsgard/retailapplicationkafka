# retailapplicationkafka

Instruction for Kafka installation for unix/ linux

1) download kafka_2.13-2.8.0.tgz
2) mkdir -p /usr/local/kafka
3) mv kafka_2.13-2.8.0 /usr/local/kafka
4) cd /usr/local/kafka/kafka_2.13-2.8.0
5) 5) Start zookeeper first
sudo /usr/local/kafka/kafka_2.13-2.8.0/bin/zookeeper-server-start.sh /usr/local/kafka/kafka_2.13-2.8.0/config/zookeeper.properties

6) Start Kafka
sudo /usr/local/kafka/kafka_2.13-2.8.0/bin/kafka-server-start.sh /usr/local/kafka/kafka_2.13-2.8.0/config/server.properties
