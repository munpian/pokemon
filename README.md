# pokemon - Spring Boot Project

このプロジェクトはGradleを使用したSpring Bootプロジェクトです。
ポケモンTCG (ポケモンカードゲーム) のシミュレーションと最適なデッキ構築の自動発見を目指しています。

## 必要な環境

- Java 21以上
- Gradle 8.7以上（gradlewを使用する場合は不要）
- Docker & Docker Compose（PostgreSQL実行用）

## プロジェクト構成

```
.
├── build.gradle          # Gradleビルド設定
├── settings.gradle       # Gradle設定ファイル
├── gradle/               # Gradleラッパー
├── src/
│   ├── main/
│   │   ├── java/        # Javaソースコード
│   │   └── resources/   # リソースファイル
│   └── test/
│       └── java/        # テストコード
└── gradlew/gradlew.bat  # Gradleラッパースクリプト
```

## ビルド方法

Windows:
```bash
gradlew.bat build
```

Linux/Mac:
```bash
./gradlew build
```

## 実行方法

Windows:
```bash
gradlew.bat bootRun
```

Linux/Mac:
```bash
./gradlew bootRun
```

## テスト実行

Windows:
```bash
gradlew.bat test
```

Linux/Mac:
```bash
./gradlew test
```

## PostgreSQL (Docker) セットアップ

### Docker起動

```bash
docker-compose up -d
```

### 接続確認

```bash
docker exec pokemon-postgres psql -U pokemon -d pokemon -c "SELECT 1"
```

### 停止・削除

```bash
docker-compose down
```

### ボリュームも削除（データベースをリセット）

```bash
docker-compose down -v
```

## データベース接続情報

- **ユーザー**: pokemon
- **パスワード**: pokemon123
- **データベース**: pokemon
- **ホスト**: localhost
- **ポート**: 5432
