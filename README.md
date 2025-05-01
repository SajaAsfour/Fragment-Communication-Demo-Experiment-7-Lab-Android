# Fragment Communication Demo (Experiment 7)

This Android application demonstrates **communication between two fragments** using an interface implemented in the hosting `Activity`.

## 📱 Description

The app contains:

- **MainActivity** – Hosts two fragments: `First` and `Second`.
- **First Fragment** – Contains a button. Each time the button is clicked, a message is sent to the second fragment.
- **Second Fragment** – Receives the message and displays it in a `TextView`.

This example shows how to use interfaces for communication between fragments through their parent activity.

## 🔧 Technologies Used

- Java
- Android SDK
- Fragments
- Interfaces

## 🧩 How It Works

1. `First Fragment` triggers a method in the `MainActivity` when a button is clicked.
2. `MainActivity` implements the `communicator` interface and passes the message to `Second Fragment`.
3. `Second Fragment` updates its `TextView` with the received message.

## 📂 File Structure

```
com.example.exp7/
│
├── MainActivity.java        # Implements communicator and handles fragment interaction
├── First.java               # Fragment with a button to send messages
├── Second.java              # Fragment that displays messages
│
res/layout/
├── activity_main.xml        # Contains two fragments in a LinearLayout
├── fragment_first.xml       # Layout for First Fragment (with a button)
├── fragment_second.xml      # Layout for Second Fragment (with a TextView)
```

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/SajaAsfour/Fragment-Communication-Demo-Experiment-7-Lab-Android.git
   ```
2. Open the project in **Android Studio**.
3. Run the project on an emulator or physical Android device.

## 📸 Screenshot

![image](https://github.com/user-attachments/assets/baf0c224-3950-49f0-a770-f298290a3f5f)
