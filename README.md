<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Association-Mapping-Hibernate</title>
</head>
<body>

<h1>Association-Mapping-Hibernate</h1>

<p>This project demonstrates different types of association mappings in Hibernate using Java, including One-to-One, One-to-Many, and Many-to-Many mappings.</p>

<h2>Getting Started</h2>

<p>To set up and run this project, you need:</p>
<ul>
    <li>Java Development Kit (JDK) 8 or higher</li>
    <li>Hibernate ORM framework</li>
    <li>MySQL (or any other database of your choice)</li>
</ul>

<h2>Project Structure</h2>

<pre>
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       ├── entity
│   │   │       │   ├── Laptop.java
│   │   │       │   ├── Student.java
│   │   │       │   ├── DepartmentOfEmp.java
│   │   │       │   ├── Employee.java
│   │   │       │   ├── Question.java
│   │   │       │   └── Answer.java
│   │   │       └── main
│   │   │           ├── MappingMain.java
│   │   │           └── StoreData.java
│   ├── resources
│   │   └── hibernate.cfg.xml
</pre>

<h2>Association Mapping Types</h2>

<p>Below are the various types of association mappings demonstrated in this project:</p>

<h3>One-to-One Mapping</h3>
<ul>
    <li><strong>Entity Classes:</strong> <code>Student</code> and <code>Laptop</code></li>
    <li><strong>Details:</strong> Each student is associated with a single laptop. The mapping is defined using <code>@OneToOne</code> annotation.</li>
</ul>

<h3>One-to-Many Mapping</h3>
<ul>
    <li><strong>Entity Classes:</strong> <code>DepartmentOfEmp</code> and <code>Employee</code></li>
    <li><strong>Details:</strong> Each department can have multiple employees. This relationship is defined using <code>@OneToMany</code> in <code>DepartmentOfEmp</code> and <code>@ManyToOne</code> in <code>Employee</code>.</li>
</ul>

<h3>Many-to-Many Mapping</h3>
<ul>
    <li><strong>Entity Classes:</strong> <code>Question</code> and <code>Answer</code></li>
    <li><strong>Details:</strong> Each question can have multiple answers, and each answer can be associated with multiple questions. This relationship is set up using <code>@ManyToMany</code> annotation.</li>
</ul>

<h2>Configuration</h2>

<p>Update the <code>hibernate.cfg.xml</code> file to set up database connectivity, as shown below:</p>

<pre>
&lt;hibernate-configuration&gt;
    &lt;session-factory&gt;
        &lt;property name="hibernate.dialect"&gt;org.hibernate.dialect.MySQLDialect&lt;/property&gt;
        &lt;property name="hibernate.connection.driver_class"&gt;com.mysql.cj.jdbc.Driver&lt;/property&gt;
        &lt;property name="hibernate.connection.url"&gt;jdbc:mysql://localhost:3306/your_database&lt;/property&gt;
        &lt;property name="hibernate.connection.username"&gt;your_username&lt;/property&gt;
        &lt;property name="hibernate.connection.password"&gt;your_password&lt;/property&gt;
        &lt;property name="hibernate.hbm2ddl.auto"&gt;update&lt;/property&gt;
    &lt;/session-factory&gt;
&lt;/hibernate-configuration&gt;
</pre>

<h2>Usage</h2>

<ol>
    <li>Clone or download the repository.</li>
    <li>Configure the database connection in <code>hibernate.cfg.xml</code>.</li>
    <li>Compile and run the <code>main</code> classes:
        <ul>
            <li><code>MappingMain</code> - Demonstrates One-to-One and One-to-Many mappings.</li>
            <li><code>StoreData</code> - Demonstrates Many-to-Many mappings.</li>
        </ul>
    </li>
</ol>

<h2>Output</h2>

<p>Each main class will display the results of the mappings, confirming that data has been persisted in the database.</p>

<h2>Dependencies</h2>

<ul>
    <li>Hibernate ORM</li>
    <li>MySQL Connector</li>
</ul>

<h2>License</h2>

<p>This project is open-source and available under the MIT License.</p>

</body>
</html>
