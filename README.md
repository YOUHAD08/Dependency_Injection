# 🚀 Dependency Injection Project

A **Spring-based** Java project demonstrating multiple **Dependency Injection (DI)** techniques, including **XML, annotations, and dynamic instantiation**.

---

## 📁 Project Structure

```
Dependency_Injection_Project  
│── src/  
│   ├── main/  
│   │   ├── java/ma/youhad/  
│   │   │   ├── dao/          # Data Access Layer (DAO)  
│   │   │   ├── extension/    # Alternative DAO Implementations  
│   │   │   ├── presentation/ # Different DI techniques (Main Apps)  
│   │   │   ├── service/      # Business Logic Layer (Service)  
│   ├── resources/  
│   │   ├── config.xml        # Spring XML Configuration  
│── test/                     # Unit Tests (Future Scope)  
│── config.txt                 # Dynamic Instantiation Config  
│── pom.xml                    # Maven Dependencies  
```

---

## ⚙️ Technologies Used

- **Java 17+**
- **Spring Framework 6.2.4**
- **Maven**

---

## 🛠️ Dependency Injection Techniques

### 🔹 1. **Static Instantiation**
Manually creating objects in the code. _(Tightly coupled)_  
🔗 [`StaticInstantiation.java`](src/main/java/ma/youhad/presentation/StaticInstantiation.java)

### 🔹 2. **Dynamic Instantiation**
Using reflection to instantiate classes from `config.txt`.  
🔗 [`DynamicInstantiation.java`](src/main/java/ma/youhad/presentation/DynamicInstantiation.java)

### 🔹 3. **Spring XML Configuration**
Defining beans in `config.xml`. _(Loose coupling via XML)_  
🔗 [`SpringXML.java`](src/main/java/ma/youhad/presentation/SpringXML.java)

### 🔹 4. **Spring Annotation Configuration**
Using `@Component`, `@Repository`, `@Service`, and `@Autowired` for DI.  
🔗 [`SpringAnnotation.java`](src/main/java/ma/youhad/presentation/SpringAnnotation.java)

---

## 🚀 Getting Started

### 1️⃣ Clone the Repo
```bash
  git clone https://github.com/your-repo/Dependency_Injection_Project.git
  cd Dependency_Injection_Project
```

### 2️⃣ Build the Project
```bash
  mvn clean install
```

### 3️⃣ Run the Application

#### 🔹 **Static Instantiation**
```bash
  java -cp target/classes ma.youhad.presentation.StaticInstantiation
```

#### 🔹 **Dynamic Instantiation**
```bash
  java -cp target/classes ma.youhad.presentation.DynamicInstantiation
```

#### 🔹 **Spring XML**
```bash
  java -cp target/classes ma.youhad.presentation.SpringXML
```

#### 🔹 **Spring Annotations**
```bash
  java -cp target/classes ma.youhad.presentation.SpringAnnotation
```

---

## 📌 Notes
- Modify `config.txt` to change **dynamic instantiation** class names.
- Update `config.xml` for **Spring XML-based DI**.

---

## 📜 License
This project is **MIT Licensed**. Feel free to use and modify it. 🚀  

