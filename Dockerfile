FROM java:8
WORKDIR /
ADD build/libs/orderservice-0.0.1-SNAPSHOT.jar ord_order_service.jar
RUN sh -c 'touch /ord_order_service.jar'
ENTRYPOINT ["java","-jar","/ord_order_service.jar"]
