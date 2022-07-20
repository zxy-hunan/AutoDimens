# AutoDimens
自动生成dimens  dp sp

**问题：**

* Where:
Initialization script 'C:\Users\Administrator\AppData\Local\Temp\TestTest_main__.gradle' line: 20

* What went wrong:
A problem occurred configuring project ':app'.

Could not create task ':app:TestTest.main()'.

SourceSet with name 'main' not found.



**解决：**

解决方法：

project模式->.idea文件夹->[gradle](https://so.csdn.net/so/search?q=gradle&spm=1001.2101.3001.7020).xml，在 <GradleProjectSettings> 节点里，增加这行代码：

```xml
<option name="delegatedBuild" value="false"/>
```

![](D:\Desktop\20210228162457239.png)
