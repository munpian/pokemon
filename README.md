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

---



# プロジェクト構成（テンプレート／静的ファイル）

以下は、先ほど説明した **src/main/resources 配下のファイル構成**をまとめた README です。

---

## 📁 ディレクトリ構成

```
src/
└── main/
    └── resources/
        ├── templates/
        │   ├── deck/
        │   │   ├── deck-list.html
        │   │   ├── deck-detail.html
        │   │   ├── deck-edit.html
        │   │   └── deck-new.html
        │   ├── match/
        │   │   ├── match-main.html
        │   │   └── match-battle.html
        │   └── player/
        │       ├── player-profile.html
        │       └── player-edit.html
        └── static/
            ├── css/
            │   └── style.css
            └── js/
                └── app.js
```

---

## 📘 説明

### `templates/`
Thymeleaf テンプレート置き場。  
画面ごとにフォルダ分けされており、UI の HTML をここに配置します。

#### `templates/deck/`
デッキ管理画面用のテンプレート  
- **deck-list.html**: デッキ一覧  
- **deck-detail.html**: デッキ詳細  
- **deck-edit.html**: デッキ編集  
- **deck-new.html**: デッキ作成  

#### `templates/match/`
対戦シミュレーション画面  
- **match-main.html**: 対戦トップ  
- **match-battle.html**: バトル画面  

#### `templates/player/`
プレイヤー管理画面  
- **player-profile.html**: プロフィール表示  
- **player-edit.html**: プロフィール編集  

---

### `static/`
JS・CSS・画像などの静的ファイルを配置する。

#### `static/css/`
アプリ全体のスタイル  
- **style.css**

#### `static/js/`
アプリ全体の JavaScript  
- **app.js**

---

## ✔ 注意点

- `templates/` は Thymeleaf の仕様で **必須のディレクトリ**  
- `static/` 以下は Spring Boot が自動で配信  
- Vue や React ではなく、今回は **Thymeleaf 前提の構成**

---

以上が、先ほど説明したテンプレート構成のまとめです。