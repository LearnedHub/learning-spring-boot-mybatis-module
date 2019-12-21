## Learning SpringBoot2 LTS

### 2019.12.21
- 添加redis

### 2019.12.20
- 从http自动跳转到https
- thin jar:使用spring-boot-thin-layout

> 之前测试一直失败，使用的1.0.22.RELEASE不确定是不是因为有bug，一直找不到ThinJarLauncher。更换1.0.23.RELEASE之后就可以了。

- how to run?
与正常的springboot fat jar其他方式一样 `java -jar web-0.0.1-SNAPSHOT.jar`，如果启动很慢，那是因为thin-launcher在后台下载依赖包。

⚠️ 使用 `<executable>true</executable>` 可能无法用zip工具查看其内部内容。

### 2019.12.19更新
- 加入ssl，同时支持http和https，对一个端口为8081，和8443，都在application.properties中配置。
- 设置http端口在在persistence的module的application-dev.properties中配置了一个server.http.port，这个信息为自定义信息。
- 在TomcatHttpConnector中定义了一个httpPort属性，并使用@Value("${server.http.port}")与application-dev.properties中的配置关联。

⚠️  修复package后无法独立启动：找不到UserRepository
> 原因: spring-boot-maven-plugin应该配置在web module下。配置在parent的pom中，导致各个module都按照spring-boot来打包。
> sprint-boot打包格式如下

```bash
.
├── BOOT-INF # 应用相关的class和libs
├── META-INF
└── org # spring相关libs
```

- Project Modules
    - api: mappers，domain
    - utils: utils, advice
    - persistence: repository
    - web: webmvc

> 都按照sping-boot来打包，那么其他module的jar都会放到BOOT-INF下，致使找不到对应的class。

### Implemented functions

- 整合通用mapper
- 使用druid数据源，加密数据库密码
- 使用mbg自动生成mapper和bean
- 自定义错误页面
   
> 使用`RestControllerAdvice`，但是需要在application.properties中配置
>
> spring.mvc.throw-exception-if-no-handler-found=true
>
> spring.resources.add-mappings=false #不跟static/error下的静态文件映射

- 返回Json过滤掉null的属性，在application.properties中配置

> spring.jackson.default-property-inclusion=non_null# 返回不为空的属性信息

- 参考如下，不生成对应的mapper.xml文件，修改generatorConfig.xml对应配置

> - MyBatis3:
>  > ANNOTATEDMAPPER:基于注解的Mapper接口，不会有对应的XML映射文件 
>  > MIXEDMAPPER:XML和注解的混合形式，(上面这种情况中的)SqlProvider注解方法会被XML替代。 
>  > XMLMAPPER:所有的方法都在XML中，接口调用依赖XML文件。
> 
> - MyBatis3Simple: 
> > ANNOTATEDMAPPER:基于注解的Mapper接口，不会有对应的XML映射文件 
> > XMLMAPPER:所有的方法都在XML中，接口调用依赖XML文件。

- 发现一个问题

> 使用mysql-java-driver高版本8以上，在数据库中比如有user这个表，在url中指定了对应的数据库了，MBG生成model时，但是还是会把数据里面系统的user生成出来。
> 换成低版本之后（5.x.x），就没事了。
