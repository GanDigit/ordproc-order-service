FROM java:8
WORKDIR /
ADD build/libs/orderservice-0.0.1-SNAPSHOT.jar ordproc_order_service.jar
RUN sh -c 'touch /ordproc__order_service.jar'
EXPOSE 80
ENTRYPOINT ["java","-jar","/ordproc_order_service.jar"]
