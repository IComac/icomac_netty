# icomac_netty

**项目架构整理和功能实现**
后端：
 1. 使用netty构建webscket服务器，编写chatHandler对消息进行处理
 2. 整合SpringBoot2.0+MyBatis+netty
	
数据库表设计：
 1. 使用Mybatis逆向工具，根据数据库表的设计自动生成对应的mapper配置文件
 2. 数据库表中存储了用户的个人信息（包括了账号密码（加密），头像，二维码，聊天记录，好友关系以及好友请求）

分布式文件存储服务器：
 1. 存储服务器存储了用户自动生成的二维码和上传的自定义头像
 2. 搭建fastdfs，并且使用nginx发布，可根据http进行web访问并且下载用户头像和二维码

netty编写心跳检测：
 - 检测客户端的读写请求来判断是否清除无用的channel。同时手机端也要保持一定的keepalive，未接受到的消息在用户下次打开后重新获取。

聊天页面开发：
	

 1. 页面的渲染（标记消息的发送方，排版）
 2. 建立会话，netty控制点对点消息发送，控制会发重连
 3. 聊天记录的本地保存与删除
 4. 消息状态的转换（未读转为已读）

通讯录开发：
 1. 页面的渲染
 2. 从后端获取好友的列表
 3. 好友账号搜索
 4. 扫一扫二维码邀请添加好友，自动双向添加好友
 5. 触发事件进行跳转聊天页面

聊天记录开发：
 1. 页面的渲染
 2. 本地保存与读取聊天记录和快照
 3. 实时更新消息的签收与未签收状态
 4. 实时更新消息的未读与已读状态

个人消息页面：
 1. 页面的渲染
 2. 个人的账号，昵称，头像，二维码的展示以及后三个的修改保存
 3. 个人用户主动退出注销，清空缓存

APP页面展示：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716224919394.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_3,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225051530.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019071622512975.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225156468.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019071622522693.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225300144.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225333363.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225357167.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190716225415985.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzMzODAxNjc5,size_5,color_FFFFFF,t_70)
