# PracticeJava

> practice java

## 开发环境

> 勿手动配置java环境变量，此操作由sdkman在安装中进行。

```bash
curl -s "https://get.sdkman.io" | bash
# sdk  list gradle
sdk install gradle 6.1.1
# sdk  list java
sdk install java 8.0.242
```

- java8 
- gradle 
- vscode
- vscode plugins
    - Gradle Language Support
    - Language Support for Java(TM) by Red Hat
    - Gradle Extension Pack
    - Gradle Tasks - Preview
    - Java Extension Pack
    - Java Dependency Viewer

## Gradle

项目自动化构建工具，引入groovy，不再使用xml。

- 自动化测试
- 依赖管理(自动解决版本冲突，使用最新的版本 )
- 发布
- 构建


### Groovy 

- 敏捷的动态语言
- 兼容java语法
- 分号可选
- 默认public
- 自动添加getter/setter
- == 等同于equals,不会有NULLPOINT
- assert语句
- 可选类型定义
- 字符串
- 集合API
- 闭包

### 仓库配置

```groovy
repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenLocal()
    mavenCentral()
}

```

### 依赖

- 编译时依赖 compile "group:name:version"

## 工程初始化

```bash
gradle init
```

## 构建及运行

```bash
./gradlew build
./gradlew run
```

## 常用的java生态库

- [rxjava](https://mcxiaoke.gitbooks.io/rxdocs/content)
- [guava](http://ifeve.com/google-guava/)

## Java 基础知识

- 基础数据类型
- 面向对象(继承、接口、抽象类)
- 注解
- 泛型
- 集合(与数据结构强相关)
- Lambda
- 异常处理
- 多线程
- 序列化

### 主题强化

- 网络
- 文件
- 流处理
    - nio
- java util concurrent
- 分布式
- 响应式处理 rxjava
- java8\9\10\11\12\13\14新增特性
    - java8
        - Lambda
            - Consumer<T>           #消息者
            - Supplier<T>           #工厂方法
            - Function<T, R>        #单入参+返回值
            - BiFunction<T, U, R>   #双入参+返回值
            - Predicate<T>          #断言型,过滤数据
        - Base64
        - LocalDate
        - LocalDateTime
        - DateTimeFormatter
        - Duration
        - Optional
        - Stream
        - IntSummaryStatistics
    - java9
        - jshell 
    - java10
        - var 类型推导
### 框架

- Spring
- Jetpack


## 参考

- [新一代构建工具gradle](https://www.imooc.com/learn/833)
- [gradle](https://www.cnblogs.com/louiezhou/p/11018847.html)
- [maven cental](https://search.maven.org/)
- [Java中的集合](https://www.imooc.com/video/2415)
- [全面解析Java注解](https://www.imooc.com/qa/456/t/0)
    - [Google Auto](https://github.com/google/auto)
- [Rxjava](https://mcxiaoke.gitbooks.io/rxdocs/content)
- [guava](https://github.com/google/guava/wiki)
- [java新特性](http://v.xue.taobao.com/learn.htm?spm=a2174.7765244.0.0.kvTSNg&courseId=115585)
- [Api 手册](https://www.apiref.com/)
