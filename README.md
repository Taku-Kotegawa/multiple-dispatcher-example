試験的にSpringBootで複数のDispatcherを起動する方法を検証したが、 本リポジトリは中途半端な状態で終わっている。
@EnableMvcを使ったため、MVCのSpringBoot標準設定が無効になっている。

### 使い方
- http://localhost:8080/ -> 標準のDispatcherで処理
- http://localhost:8080/api/order -> WebAPI用のDispatcherで処理

