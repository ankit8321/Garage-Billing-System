🚗 Overview

This is a Java-based console application for managing a garage's customer services and billing system. The system allows garage owners to:

Add customers with car details.
Add services such as car washes, punctures, wheel aligning, etc.
Generate invoices for services rendered.
Track service history for each customer.


🔧 Technologies Used

Java (Core Java)
Collections (HashMap, ArrayList)
Object-Oriented Programming (OOP) principles like Encapsulation, Inheritance, and Association
Git for version control
GitHub for hosting the project


💡 Features

Add Customer: Allows adding a new customer with their name, phone number, and car details.
Available Services: Users can choose from various car services like "Car Wash," "Oiling," "Paint," etc.
Invoice Generation: The system generates an invoice listing the selected services and the total bill.
Interactive Menu: The system uses a menu-driven interface for user interaction.



📁 Project Structure

Car: Represents the car details of the customer (Car Number, Model).
Customer: Stores customer information (Name, Phone, Car).
Service: Represents a service offered in the garage (Name, Price).
Invoice: Generates the invoice for a customer including services selected and total cost.
GarageService: Manages customer data, available services, and invoice generation.


🤖 Future Improvements
File Handling: Implement file operations to save and load customer data.
Database Integration: Integrate MySQL or any database to store customer and service details.
GUI: Create a graphical user interface using JavaFX or Swing for a better user experience.
