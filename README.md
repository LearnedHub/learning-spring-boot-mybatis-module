## learning spring boot mybatis

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