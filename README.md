# 🚀 Simple Java + Maven + Docker + Jenkins + Nexus CI/CD Project

## 📌 Overview

This project demonstrates a complete **CI/CD pipeline** using:

* Java (simple application)
* Maven (build & dependency management)
* Docker (containerization)
* Jenkins (automation server)
* Sonatype Nexus (artifact & Docker registry)

The pipeline automates:

* Code checkout
* Build and unit testing
* Packaging into a JAR
* Building a Docker image
* Pushing the Docker image to Nexus

---

## 🛠️ Tech Stack

* Java 17
* Apache Maven
* Docker
* Jenkins (Declarative Pipeline)
* Sonatype Nexus Repository

---

## 📂 Project Structure

```
├── Jenkinsfile

├── Dockerfile

├── pom.xml

└── src

    ├── main/java/com/example/App.java

    └── test/java/com/example/AppTest.java
```

---

## ⚙️ How It Works

### 1. Build & Test

Maven compiles the code and runs unit tests:


mvn clean test


### 2. Package

Creates an executable JAR file:


mvn package


### 3. Docker Build

Builds a Docker image containing the application:


docker build -t <nexus-registry>/my-java-app:1.0 .


### 4. Push to Nexus (Docker Registry)

Pushes the Docker image to Nexus:


docker push <nexus-registry>/my-java-app:1.0


---

## 🔄 Jenkins Pipeline Stages

* **Checkout** – Pulls source code from repository
* **Build & Test** – Runs unit tests using Maven
* **Package** – Builds the JAR file
* **Docker Build** – Creates Docker image
* **Docker Login** – Authenticates with Nexus
* **Docker Push** – Pushes image to Nexus registry

---

## 🔐 Credentials Management

* Nexus credentials are securely stored in Jenkins
* Injected using Jenkins credentials binding
* Used for Docker login during pipeline execution

---

## 🧪 Test Reporting

* JUnit reports are generated via Maven Surefire
* Published automatically in Jenkins
* Build fails if any test fails

---

## 📦 Artifact Management

Artifacts are stored in **Sonatype Nexus**:

### Docker Images

* Stored in a **Docker Hosted Repository**
* Versioned using tags (e.g., `1.0`, `latest`)

### JAR Files (optional)

* Can still be archived in Jenkins
* Can be deployed to Nexus Maven repositories if needed

---

## ⚠️ Prerequisites

* Jenkins with:

  * Maven configured
  * JDK 17 installed
  * Docker installed on agent
* Nexus Repository with:

  * Docker (hosted) repository
  * Docker Bearer Token Realm enabled

---

## 💡 Key Highlights

* End-to-end CI/CD pipeline
* Automated testing and validation
* Docker-based deployment workflow
* Secure credential handling
* Integration with Nexus as Docker registry

---

## 🎯 Purpose

This project demonstrates:

* CI/CD pipeline design using Jenkins
* Docker-based application deployment
* Integration with Nexus for artifact management
* Maven-based Java development workflow

---

## 👤 Author

**Muhanad Mohamed**
