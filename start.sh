NG=zh_CN.utf8
java -jar build/libs/vertx-blueprint-todo-backend-fat.jar -conf config_jdbc.json &
echo $!
echo $! > ./logins.pid
