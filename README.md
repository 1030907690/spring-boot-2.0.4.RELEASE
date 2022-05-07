## 找不到类的解决办法
- spring boot2.0.4源码 测试了下先运行spring-boot里的SpringApplication或者SpringApplicationTests编译出class,不然运行game-pay的时候包找不到class
- 先执行
  ```
  mvn clean package -DskipTests
  ```
  打包一次，可能会异常，只生成部分class，不过没关系，一样可以运行

