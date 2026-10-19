# 🔨 Online Auction System

<div align="center">

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![JavaFX](https://img.shields.io/badge/JavaFX-21-007396?style=for-the-badge)](https://openjfx.io)
[![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org)
[![License](https://img.shields.io/badge/License-MIT-22C55E?style=for-the-badge)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-FF6B6B?style=for-the-badge)](https://github.com/iloveuet/online-auction-system/pulls)

<br/>

<img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Objects/Hammer.png" alt="Hammer" width="120" />

**🎯 Real-time auctions. Fair bidding. Built with Java & JavaFX.**

A client–server auction system built as a team project for the Advanced Programming course.

[Features](#-features) • [Installation](#-installation) • [Usage](#-usage) • [Contributing](#-contributing)

</div>

---

## ✨ Features

<table>
<tr>
<td width="50%">

### 👥 Three User Roles
Bidder, Seller, and Admin — each role gets its own screens and permissions.

### 🔨 Real-Time Bidding
Place bids and get notified instantly when someone outbids you (Observer pattern).

### 📦 Item Management
Sellers create auctions for Electronics, Art, Vehicles, and more (Factory Method).

</td>
<td width="50%">

### 🔄 Auction Lifecycle
Auctions move through OPEN → RUNNING → FINISHED → PAID / CANCELED automatically.

### 🧵 Concurrency-Safe
synchronized & ReentrantLock prevent lost updates when bids race each other.

### 🧩 Design Patterns Inside
Singleton (AuctionManager), Factory Method (ItemFactory), and Observer.

</td>
</tr>
</table>

---

## 🚀 Installation

> 📌 **Prerequisite:** JDK 17 or higher installed.

### Option 1: Quick Start with IntelliJ (Recommended)

```bash
# Step 1: Clone the repository
git clone https://github.com/iloveuet/online-auction-system.git
cd online-auction-system

# Step 2: Open the project in IntelliJ IDEA
# Step 3: Open the Maven panel (right side) → Plugins → javafx → double-click javafx:run
```

> ⚠️ **Important:** On first open, let IntelliJ finish downloading the Maven dependencies, otherwise the JavaFX imports will show errors.

---

### Option 2: Run from Terminal

Requires Maven installed on your machine:

```bash
git clone https://github.com/iloveuet/online-auction-system.git
cd online-auction-system

# Run the app
mvn javafx:run
```

---

## 📖 Usage

### 1️⃣ Login

Open the app and log in with your account. The home screen depends on your role: **Bidder**, **Seller**, or **Admin**.

---

### 2️⃣ Browse Auctions & Place a Bid

Pick any running auction from the list to see its details:

```
━━━ 🔨 Vintage 35mm Film Camera ━━━
Current Price: $75.00      Bids: 12
Time Left: 02:14:37        Seller: seller01

Enter your bid → [ Place Bid ]
```

> 💡 **Tip:** Your bid must be higher than the current price. If someone outbids you, the app notifies you in real time.

---

### 3️⃣ Sell an Item (Seller only)

Select **Create Auction** → Enter the item details, starting price, and duration → Your auction appears in the list immediately.

✅ Auction created successfully!

---

### 4️⃣ Auction Ends

When the timer runs out, the auction closes automatically and the highest bidder wins. The winner proceeds to payment (status: PAID).

---


## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| ![Java](https://img.shields.io/badge/-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) | Core language (17+) |
| ![JavaFX](https://img.shields.io/badge/-JavaFX-007396?style=flat-square) | GUI framework (21) |
| ![Maven](https://img.shields.io/badge/-Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white) | Build & dependencies |
| ![JUnit](https://img.shields.io/badge/-JUnit_5-25A162?style=flat-square&logo=junit5&logoColor=white) | Unit testing |
| ![GitHub Actions](https://img.shields.io/badge/-GitHub_Actions-2088FF?style=flat-square&logo=github-actions&logoColor=white) | CI/CD |
| Java Socket | Client–server networking & Serialization |

---

## 📂 Project Structure

```
online-auction-system/
├── 📁 docs/
│   ├── CurrentClassDiagram.png  # UML class diagram
│   └── Aunction.xmi             # Diagram source (Umbrello)
├── 📁 src/main/java/org/example/
│   ├── Main.java                # Entry point (JavaFX)
│   ├── MainDemo.java            # Console demo
│   ├── 📁 model/                # User, Item, Auction, Bid, AuctionStatus
│   ├── 📁 manager/              # AuctionManager (Singleton)
│   ├── 📁 factory/              # ItemFactory (Factory Method)
│   └── 📁 observer/             # Real-time bid notifications (week 7)
├── 📁 src/main/resources/       # FXML views & styles
├── 📁 src/test/java/            # JUnit tests
├── pom.xml                      # Maven config
└── README.md
```

---

## 🗓️ Roadmap

| Week | Focus |
|------|-------|
| 6 | Repo setup, class diagram, Singleton + Factory, JavaFX Hello World |
| 7 | Observer pattern, bidding logic, concurrency |
| 8 | Custom exceptions, JUnit tests, refactoring |
| 9 | Maven, Checkstyle, GitHub Actions, Socket |
| 10 | Full client–server + main GUI screens |
| 11–12 | System integration, end-to-end testing |
| 13–14 | UI polish, advanced features |
| 15 | Final demo & grading |

---

## 🤝 Contributing

Contributions are welcome! For team members:

1. **Clone** the repository and work on the `dev` branch
2. **Create** your feature branch (`git checkout -b feature/amazing`)
3. **Commit** your changes using Conventional Commits (`git commit -m 'feat: add login screen'`)
4. **Push** to the branch (`git push origin feature/amazing`)
5. **Open** a Pull Request for review



---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

<div align="center">

**Made with ❤️ by the iloveuet**

[![Star](https://img.shields.io/github/stars/iloveuet/online-auction-system?style=social)](https://github.com/iloveuet/online-auction-system/stargazers)
[![Fork](https://img.shields.io/github/forks/iloveuet/online-auction-system?style=social)](https://github.com/iloveuet/online-auction-system/network/members)

</div>
