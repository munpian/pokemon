# PostgreSQL 接続情報

## 現在の状態
✅ **PostgreSQL起動中**
✅ **pokemonデータベース作成済み**

## DBeaver用接続設定

### 基本情報
- **Server Host**: localhost
- **Port**: 5432
- **Database**: pokemon
- **Username**: postgres
- **Password**: postgres

### JDBC URL
```
jdbc:postgresql://localhost:5432/pokemon
```

### 接続手順（DBeaver）

1. DBeaverを開く
2. **Database** → **New Database Connection** を選択
3. **PostgreSQL** を選択して **Next**
4. 以下の情報を入力：
   - **Server Host**: localhost
   - **Port**: 5432
   - **Database**: pokemon
   - **Username**: postgres
   - **Password**: postgres
5. **Test Connection** をクリックして接続確認
6. **Finish** をクリック

### PostgreSQL 起動/停止方法

**起動:**
```powershell
& "C:\Program Files\PostgreSQL\15\bin\pg_ctl" -D "C:\Program Files\PostgreSQL\15\data" -l "C:\Program Files\PostgreSQL\15\data\logfile.log" start
```

**停止:**
```powershell
& "C:\Program Files\PostgreSQL\15\bin\pg_ctl" -D "C:\Program Files\PostgreSQL\15\data" stop
```

### Spring Boot アプリケーション設定

現在のapplication.ymlにはこのPostgreSQL接続情報が設定されています：

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/pokemon
    username: postgres
    password: postgres
    driver-class-name: org.postgresql.Driver
```

### PostgreSQL サービス情報

- **インストールパス**: C:\Program Files\PostgreSQL\15
- **バージョン**: PostgreSQL 15.15
- **ポート**: 5432 (デフォルト)
- **データディレクトリ**: C:\Program Files\PostgreSQL\15\data
- **ログファイル**: C:\Program Files\PostgreSQL\15\data\logfile.log
