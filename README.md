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
- 依赖管理
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

## 工程初始化

```bash
gradle init
```

## 构建及运行

```bash
./gradlew build
./gradlew run
```

## 参考

- [新一代构建工具gradle](https://www.imooc.com/learn/833)
- [gradle](https://www.cnblogs.com/louiezhou/p/11018847.html)
