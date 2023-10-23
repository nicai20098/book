# book
# 书籍类相关源码提交
## 2.2.1RELEASE 是springboot 技术内幕代码演示
### 遇到问题汇总
#### 问题1 自定义的测试类报错
报错内容1
java: 服务配置文件不正确, 或构造处理程序对象javax.annotation.processing.Processor: Provider org.springframework.boot.configurationprocessor.ConfigurationMetadataAnnotationProcessor not found时抛出异常错误
原因是:使用的Unit不同 应该使用的是org.junit.jupiter.api.Test的Test类而非org.junit.Test
报错内容2
Error running TestSummary.testMultiValueMap. Command line is too long. Shorten the command line via JAR manifest or via a classpath file and rerun.
解决方式使用 Short command line:JAR manifest 正常执行

