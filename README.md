# Simple Maven + Jenkins + Nexus CI/CD Project

## 📌 Overview
This project demonstrates a basic Continuous Integration / Continuous Deployment (CI/CD) pipeline using:

- Java (simple application)
- Maven (build & dependency management)
- Jenkins (automation server)
- Nexus (artifact repository)

The pipeline automates:
- Code checkout
- Build and test execution
- Packaging the application into a JAR
- Publishing artifacts to Nexus

---

## 🛠️ Tech Stack
- Java 17
- Apache Maven
- Jenkins Pipeline (Declarative)
- Sonatype Nexus Repository

---

## 📂 Project Structure

├── Jenkinsfile
├── pom.xml
└── src
├── main/java/com/example/App.java
└── test/java/com/example/AppTest.java


---

## ⚙️ How It Works

### 1. Build & Test
Maven compiles the code and runs unit tests:
```bash
mvn clean test

2. Package

Creates a JAR file:

mvn package
3. Deploy to Nexus

Uploads the artifact to Nexus:

mvn deploy

Jenkins Pipeline

The pipeline includes the following stages:

Checkout – Pulls source code from repository
Build & Test – Runs unit tests
Package – Builds the JAR file
Deploy – Pushes artifact to Nexus
🔐 Credentials Management
Nexus credentials are securely stored in Jenkins
Credentials are injected during pipeline execution

Test Reporting
JUnit reports are generated and published in Jenkins
Build status reflects test success/failure
📦 Artifact Management
Artifacts are stored in Nexus repositories:
Snapshots → for development versions
Releases → for stable versions

💡 Key Highlights
End-to-end CI/CD pipeline implementation
Automated testing and artifact deployment
Clean and minimal project structure
Industry-standard tools and practices
🎯 Purpose

This project is designed to showcase:

Understanding of CI/CD concepts
Hands-on experience with Jenkins pipelines
Integration with artifact repositories (Nexus)
Maven-based Java project management

👤 Author

[Muhanad Mohamed]