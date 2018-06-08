pid=`pgrep -f "java.*eureka-server*"`
kill -9 "$pid"
java -jar target/eureka-server-1.0-SNAPSHOT.jar &
