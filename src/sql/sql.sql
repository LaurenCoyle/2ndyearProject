Drop TABLE Booking_Info;
Drop TABLE Booking;
Drop TABLE Administrator;
Drop TABLE Hotel;
Drop TABLE Room;
Drop TABLE Member;

CREATE TABLE Member (
        User_ID NUMBER PRIMARY KEY, 
	EMAIL VARCHAR2(40), 
	PASSWORD VARCHAR2(255)
);

CREATE TABLE Booking(
        Booking_No NUMBER,
        BookingDate_Start DATE,
        BookingDate_End DATE,
        Activity VARCHAR2(25),
        Price NUMBER,
        User_ID NUMBER NOT NULL,
        PRIMARY KEY (Booking_No),
        FOREIGN KEY (User_ID) REFERENCES Member (User_ID)
);

CREATE TABLE Hotel(
        Hotel_ID NUMBER,
        Hotel_Name VARCHAR(20),
        Hotel_Address VARCHAR(20),
        NumberOfRooms NUMBER,
        PRIMARY KEY (Hotel_ID)
);
CREATE TABLE Administrator(
        Admin_ID NUMBER,
        Admin_Name VARCHAR2(20),
        Admin_Email VARCHAR2(20),
        Admin_Password VARCHAR2(20),
        Admin_PhoneNum NUMBER,
        Hotel_ID NUMBER NOT NULL,
        PRIMARY KEY(Admin_ID),
        FOREIGN KEY(Hotel_ID) REFERENCES Hotel(Hotel_ID)
);
CREATE TABLE Room(
        Room_ID NUMBER,
        Room_Number NUMBER,
        Room_Type VARCHAR2(20),
        Room_Cost NUMBER,
        Room_NumberOfBeds NUMBER,
        PRIMARY KEY(Room_ID)
);

CREATE TABLE BookingInfo(
        Booking_No NUMBER NOT NULL,
        User_ID NUMBER NOT NULL,
        Hotel_ID NUMBER NOT NULL,
        Room_ID NUMBER NOT NULL,
        FOREIGN KEY(Booking_No) REFERENCES Booking (Booking_No),
        FOREIGN KEY(User_ID) REFERENCES Member(User_ID),
        FOREIGN KEY(Hotel_ID) REFERENCES Hotel (Hotel_ID),
        FOREIGN KEY(Room_ID) REFERENCES Room (Room_ID)
);

select * Administrator;


