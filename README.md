# Java Electronics Store Management System

A Java console-based application for managing an electronics store, designed to demonstrate core concepts of **object-oriented programming**, **inventory handling**, **sales and order management**, and **file-based persistence**.

The project is divided into two parts:

* **Part 1:** an in-memory version of the store system
* **Part 2:** an extended version with persistent storage using text files

Together, these two parts present the evolution of a complete academic Java project, starting from object modeling and business logic and extending into data storage and retrieval.

---

## Overview

This project simulates the operation of an electronics store through a menu-driven console application.

The system allows the user to:

* browse devices by category
* inspect product details
* purchase devices
* complete sales when stock is available
* create customer orders when stock is unavailable
* review existing sales
* review pending orders
* execute orders when products arrive

The project is centered around a rich hierarchy of electronic devices and a simple but realistic business workflow.

---

## Main Objectives

The main goals of the project are:

* model multiple types of electronic devices using inheritance
* organize products into categories and subcategories
* manage stock availability
* support direct sales and pending customer orders
* store customer and transaction information
* demonstrate the transition from in-memory processing to persistent storage

This makes the project especially suitable for courses related to:

* Java Programming
* Object-Oriented Programming
* Data Structures
* File Handling
* Software Design Fundamentals

---

## Project Structure

```text
Java_Project/
├── Java_part1/
│   ├── Device.java
│   ├── TV.java
│   ├── BluRayDVDPlayer.java
│   ├── Camera.java
│   ├── Console.java
│   ├── Refrigerator.java
│   ├── WashingMachine.java
│   ├── Sale.java
│   ├── Order.java
│   └── mainApp.java
├── Java_part2/
│   ├── Device.java
│   ├── TV.java
│   ├── BlueRayDVDPlayer.java
│   ├── Camera.java
│   ├── Console.java
│   ├── Refrigerator.java
│   ├── WashingMachine.java
│   ├── Sale.java
│   ├── Order.java
│   ├── mainApp.java
│   ├── Devices.txt
│   ├── Orders.txt
│   └── Sales.txt
├── README.md
└── .gitignore
```

---

## Technologies Used

* **Java**
* **ArrayList** for in-memory collections
* **LocalDate** and date formatting utilities
* **File I/O** for persistent storage
* **Custom text parsing** for serialization and deserialization
* **Console-based user interface**

---

# General System Design

The application models an electronics store built around three main concepts:

* **Devices**
* **Sales**
* **Orders**

The workflow is straightforward and realistic:

* if a product is available in stock, a customer purchase becomes a **sale**
* if a product is not available in stock, the purchase becomes an **order**
* pending orders can later be executed and converted into completed sales

This gives the project a complete product-sales-order lifecycle.

---

# Core Domain Model

## `Device`

The `Device` class is the central base class of the system.

It stores the common properties shared by all products:

* product code
* model name
* manufacturing year
* manufacturer
* price
* stock quantity

This class provides the common identity and structure for all electronic items in the store.

### Why It Matters

The whole project is built around this abstraction. All product types inherit from `Device`, making it possible to store different kinds of items inside a single collection while still preserving their specific attributes.

---

## Device Subclasses

The system supports several categories of electronic products through inheritance.

### `TV`

Represents televisions.

Additional attributes include:

* panel type
* dimensions
* resolution
* interfaces

### `BluRayDVDPlayer` / `BlueRayDVDPlayer`

Represents Blu-ray and DVD players.

Additional attributes include:

* player type
* resolution
* supported formats

### `Camera`

Represents cameras.

Additional attributes include:

* camera type
* megapixels
* optical zoom
* digital zoom
* screen size

### `Console`

Represents gaming consoles.

Additional attributes include:

* console type
* processor
* graphics
* sound system
* storage capacity

### `Refrigerator`

Represents refrigerators.

Additional attributes include:

* refrigerator type
* energy class
* total storage capacity
* freezer capacity

### `WashingMachine`

Represents washing machines.

Additional attributes include:

* energy class
* capacity
* spin speed

### Why This Hierarchy Is Important

This inheritance structure demonstrates classic object-oriented design:

* shared properties are stored in the superclass
* specialized product details are stored in subclasses
* all devices can still be managed uniformly through `Device` references

---

## `Sale`

The `Sale` class represents a completed transaction.

It stores information such as:

* unique sale code
* sold device
* customer name
* customer phone number
* sale date
* total cost

### Role in the System

A sale is created when a customer buys a product that is currently available in stock.

The sale records the transaction history of the store and acts as proof that the item was successfully sold.

---

## `Order`

The `Order` class represents a pending customer order.

It stores:

* unique order code
* device reference
* customer name
* customer phone number
* order date
* expected arrival date
* total cost
* execution status

### Role in the System

An order is created when a customer wants to buy a product that is not currently available in stock.

Later, when the item is considered available, the order can be executed and transformed into a completed sale.

This makes the `Order` class essential for modeling delayed transactions and future fulfillment.

---

# Part 1 — In-Memory Store Management

## Purpose

The first part of the project implements the store logic entirely in memory.

All devices, sales, and orders are stored in Java collections during execution, but no data is saved after the program terminates.

This version focuses on:

* object-oriented modeling
* business logic
* menu handling
* product browsing
* order and sale creation

---

## `mainApp` in Part 1

The `mainApp` class acts as the entry point of the application.

### Responsibilities

* initialize a predefined list of devices
* create collections for sales and orders
* display the menu
* process user input
* coordinate all store operations

### Internal Collections

The program maintains:

* an `ArrayList<Device>` for products
* an `ArrayList<Sale>` for completed sales
* an `ArrayList<Order>` for pending orders

These collections form the in-memory store database for the duration of the program.

---

## Main Menu

The user interacts with the system through a simple menu:

* `1. View Devices`
* `2. View Orders`
* `3. View Sales`
* `0. Exit`

This loop continues until the user chooses to exit the application.

---

## Device Browsing Workflow

One of the main functionalities of the system is browsing products.

### Device Categories

The products are grouped into the following high-level categories:

#### 1. Audio & Video Devices

Includes:

* televisions
* Blu-ray players
* cameras

#### 2. Gaming Devices

Includes:

* consoles

#### 3. Home Devices

Includes:

* refrigerators
* washing machines

### User Flow

The user:

1. chooses a category
2. chooses a product subtype
3. views a filtered list of matching devices
4. selects a device by code
5. sees the full details of the chosen product
6. decides whether to buy it

This creates a structured shopping flow similar to a real store catalog browsing system.

---

## Purchase Logic

The purchase process is one of the most important parts of the system.

### Purchase Data Collected

When a customer decides to buy a product, the system asks for:

* quantity
* customer name
* customer phone number

### Case 1: Sufficient Stock

If the requested device is available in stock:

* the total cost is calculated
* the stock quantity is reduced
* a new `Sale` object is created
* the sale is stored in the sales list

### Case 2: Insufficient Stock

If the requested device is not available:

* the user provides an expected arrival date
* a new `Order` object is created
* the order is stored in the orders list

This dual behavior makes the project closer to a real-world retail application.

---

## Viewing Orders in Part 1

When the user selects the orders menu, the system:

* displays all existing orders
* allows the user to select an order by code
* offers the possibility to execute it

### Order Execution

Executing an order means:

* creating a new `Sale`
* transferring customer and product information
* marking the order as executed

This models the real-world moment when an ordered product arrives and the store completes the transaction.

---

## Viewing Sales in Part 1

The sales menu displays all completed sales.

This gives the user access to the sales history of the store and provides a record of successful transactions.

---

# Part 2 — Persistent Store Management with Files

## Purpose

The second part of the project extends the first one by adding persistent storage.

Unlike Part 1, where all data disappears after the application closes, Part 2 stores the system state inside text files.

This means that:

* products can be loaded from file
* sales can be stored and reloaded
* orders can persist between executions

This transforms the project from a purely in-memory exercise into a more complete data-driven application.

---

## Files Used in Part 2

Part 2 introduces three important files:

### `Devices.txt`

Stores the available products.

### `Orders.txt`

Stores all pending or previously created customer orders.

### `Sales.txt`

Stores all completed sales.

Together, these files function as the persistent storage layer of the application.

---

## `mainApp` in Part 2

The `mainApp` class in Part 2 has the same overall role as in Part 1, but with an additional persistence layer.

### Startup Logic

At the beginning of execution, it loads data from files using methods such as:

* `readDeviceFile(...)`
* `readOrderFile(...)`
* `readSaleFile(...)`

### Shutdown Logic

Before the application exits, it saves the current state back to the files using:

* `createDeviceFile(...)`
* `createOrderFile(...)`
* `createSaleFile(...)`

This allows the store state to survive across multiple runs of the program.

---

## File Format and Parsing

The project does not use JSON, XML, or a database. Instead, it relies on a **custom text-based format**.

### Devices File

The devices file stores products in a structured block-style format with fields such as:

* code
* item type
* model name
* year
* manufacturer
* price
* stock
* type-specific attributes

### Orders and Sales Files

The orders and sales files store transaction information in a similar text-based style.

### Why This Matters

This part of the project demonstrates:

* manual serialization
* manual deserialization
* custom parsing logic
* reconstruction of object instances from text data

This is an important step in understanding how object state can be stored and restored without a database.

---

## Persistence Workflow

The persistence process in Part 2 works as follows:

### On Application Start

1. Open the text files
2. Parse the stored data
3. Reconstruct devices, orders, and sales
4. Populate the in-memory collections

### During Runtime

The system behaves just like Part 1:

* browsing devices
* creating sales
* creating orders
* executing orders

### On Exit

1. Traverse all collections
2. Convert the objects back into text format
3. Write the data into the respective files

This gives the application a full load-modify-save lifecycle.

---

# Comparison Between Part 1 and Part 2

The two parts of the project are closely related, but they serve slightly different educational purposes.

## Part 1

Focuses on:

* class design
* inheritance
* product and transaction modeling
* business workflow logic
* console interaction

## Part 2

Builds on Part 1 and adds:

* file handling
* persistent storage
* object reconstruction from text
* saving store state between runs

### Educational Value of This Progression

This two-part structure is especially useful because it shows how a project can evolve:

* first by building the core business logic
* then by extending it with persistence and data storage

---

# Object-Oriented Programming Concepts Demonstrated

This project is a strong example of Java OOP design.

It demonstrates:

## Inheritance

All device categories inherit from `Device`.

## Polymorphism

Different device types are stored and managed through `Device` references.

## Encapsulation

Each class stores and manages its own fields and behavior.

## Composition

`Sale` and `Order` objects contain references to `Device` objects and customer-related information.

## Abstraction

The store treats many different electronic items through a common product abstraction while still preserving type-specific details.

---

# Business Logic Demonstrated

The project also models real-world retail logic.

### Inventory Management

Every product has stock information.

### Direct Sales

Available products can be sold immediately.

### Customer Orders

Unavailable products can still be requested through a customer order.

### Order Fulfillment

Pending orders can later be completed and transformed into sales.

### Transaction History

The store keeps a history of completed sales and pending orders.

This makes the application more realistic than a simple catalog viewer.

---

# Typical User Scenario

A complete user session may look like this:

1. Launch the application
2. Browse devices by category
3. Choose a specific product code
4. View full technical details of the product
5. Decide to buy it
6. Enter quantity and customer details
7. If stock exists, complete a sale
8. If stock does not exist, create an order
9. Later, open the orders menu
10. Execute an order and convert it into a sale
11. Review the sales history
12. Exit the application

In Part 2, all of this information can be stored and retrieved across executions.

---

# How to Run the Project

Because the project is divided into two parts, each version can be run independently.

## Requirements

You need:

* Java JDK installed
* a Java IDE or terminal

---

## Run Part 1

Compile the Java files inside `Java_part1` and run `mainApp`.

Example:

```bash
javac *.java
java mainApp
```

---

## Run Part 2

Compile the Java files inside `Java_part2` and run `mainApp`.

Make sure that the following files are present in the same working directory or in the expected path:

* `Devices.txt`
* `Orders.txt`
* `Sales.txt`

Example:

```bash
javac *.java
java mainApp
```

---

# Why This Project Is Interesting

This project stands out because it is not just a class hierarchy exercise.

It combines:

* object-oriented modeling
* inventory management
* customer transaction workflows
* delayed order fulfillment
* persistent storage through files
* practical menu-based interaction

As a result, it feels much closer to a small business management application than to a simple academic class demo.

---

# Learning Outcomes

By studying or extending this project, one can better understand:

* how inheritance is used in Java to model product families
* how polymorphism helps manage diverse product types uniformly
* how business workflows can be translated into program logic
* how to store and process transactions in object-oriented form
* how to move from in-memory storage to persistent file-based storage
* how to serialize and deserialize application data manually

---

# Possible Extensions

The project already provides a strong foundation and can be extended in many ways.

Possible improvements include:

* adding product search by code or manufacturer
* adding product deletion or update functionality
* validating user input more strictly
* supporting discounts or promotions
* separating UI logic from business logic more clearly
* replacing custom text files with JSON or a database
* generating sales reports and statistics
* introducing an employee/admin role system
* building a GUI version instead of a console interface

These additions could turn the current academic exercise into a more advanced store management application.

---

# Repository Goals

This repository showcases:

* a Java console application for electronics store management
* object-oriented modeling of multiple device categories
* sales and order transaction handling
* inventory-aware purchase logic
* file-based persistence in the extended version
* the progression from a simple in-memory application to a more complete persistent system

---

## Authors


* Konstantinos Gougas

---

## Final Notes

This project demonstrates how Java object-oriented programming can be applied to the design of a realistic store management application. By combining product hierarchies, stock-aware sales logic, customer orders, and persistent storage, it provides a complete and educational example of practical software development in Java.
