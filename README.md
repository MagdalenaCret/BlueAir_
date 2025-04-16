# ✈️ BlueSky App - Flight Booking Mobile Application

## 📝 Overview
BlueSky is an Android mobile application for a travel agency that allows users to search, book and pay for flight tickets. The application connects to a MySQL database for data storage and management, and integrates Google Pay for secure payment processing.

## ✨ Features
* 🔐 User authentication and registration
* 🔍 Flight search with multiple filters
* 📋 Booking management
* 🎟️ Ticket generation with QR codes
* 💳 Google Pay integration for secure payments
* 🏨 Hotel suggestions for destinations
* 👤 Account management with booking history

## ✨ Presentation
<div align="center">
  <p float="left">
    <img src="images/image_scene.jpg" width="400" alt="Scene Screenshot 1"/>
    <img src="images/image2.png" width="400" alt="Scene Screenshot 2"/>
  </p>
  <p float="left">
    <img src="images/image3.png" width="400" alt="Scene Screenshot 3"/>
    <img src="images/image4.png" width="400" alt="Scene Screenshot 4"/>
  </p>
</div>

## 🏗️ Project Structure
The project follows an Activity and Fragment-based architecture:
* **MainActivity**: Main entry point with navigation drawer
* **User Authentication**: Login/Register activities
* **Fragments**: Home, Bookings, Cart, Hotels, About Us
* **Database**: MySQL with JDBC connectivity

## 💾 Database Schema
The application uses a MySQL database with the following main tables:
* `users`: User account information
* `flights`: Flight details and availability
* `bookings`: Reservation information
* `payments`: Payment transaction data
* `airlines`: Airline company information
* `hotels`: Hotel information for destinations
* `locations`: City and country data
* `cart`: Shopping cart items

## 🔧 Technical Implementation
* **Language**: Java
* **Database Connectivity**: JDBC (Java Database Connectivity)
* **Asynchronous Operations**: AsyncTask
* **Payment Processing**: Google Pay API
* **UI Components**: ConstraintLayout, RelativeLayout, LinearLayout
* **Data Management**: ViewModel for handling configuration changes

## 📥 Installation Requirements
* Android Studio
* MySQL Server
* Google Pay API setup
* JDK (Java Development Kit)

## 📱 Usage
1. Clone the repository
2. Set up MySQL database using the provided schema
3. Configure database connection settings
4. Build and run the application in Android Studio

## 🚀 Future Improvements
* Enhanced security for database interactions
* Optimization of database operations
* Expanded device compatibility
* Robust error handling
* Cross-platform support

## 👥 Contributors
* Bălan Ionela-Loredana
* Creț Maria-Magdalena
* Bartha Emeric-Arthur

## 🎓 Academic Details
This project was developed for the Database Management course in the second year of study at the Technical University of Cluj-Napoca.
