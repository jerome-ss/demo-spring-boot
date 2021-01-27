#demo-spring-boot

### IDE
IDEA
    
### 使用到的技术
1. maven 3.3.9 (settings.xml见doc目录)
2. jdk1.8.0
3. spring boot 1.3.7 
4. MyBatis
5. 使用开发的工具: Eclipse neon
6. RESTful

### 运行
1. 启动 
      运行 ApplicationController.main()
      
2. 访问接口
   http://127.0.0.1/test 
   
   访问页面
   http://127.0.0.1/index.html
   
   访问资源
   http://127.0.0.1/imgs/desktop.jpg
   
### 打包部署

在项目根路径下使用maven命令打包：mvn clean package 

将target目录下的jar拷贝，并运行项目： java –jar demo-spring-boot-0.0.1-SNAPSHOT.jar 
多环境项目运行：java -jar demo-spring-boot-0.0.1-SNAPSHOT.jar --spring.profiles.active=test

### Spring boot 例子
https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples