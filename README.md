# Hospital Emergency Room Management System (Java)

The **Hospital Emergency Room Management System** is a Java-based application designed to streamline the management of patients, doctors, beds, and other resources in a hospital emergency room setting. It provides tools for efficient allocation and tracking of resources based on patient severity and other factors.

## Features

1. **Patient Management**:
   - Log new patient check-ins with details like ID, name, age, and severity level.
   - Update patient information, including name, age, and severity level.
   - Assign doctors and beds to patients.
   - Discharge patients and release allocated resources.

2. **Doctor Management**:
   - Assign doctors to patients based on availability.
   - Manage doctor shifts (Day, Night, Evening).
   - View a list of all doctors and their details.
   - Add new doctors to the system.

3. **Bed Management**:
   - Allocate beds to patients based on availability.
   - Track bed occupancy and release beds upon patient discharge.
   - View the total number of free beds.

4. **Queue Management**:
   - Prioritize patients based on their severity level using a priority queue.
   - View all patients in the queue, sorted by severity.

5. **Admin Tools**:
   - View available resources (beds, doctors).
   - Search for patients by ID.
   - Add new doctors and manage hospital resources.

---

## Project Structure

### Classes and Key Responsibilities

1. **`Bed_Sec51_G5`**:
   - Represents a hospital bed with attributes like ID and availability status.
   - **Attributes**:
     - `id`: Unique identifier for the bed.
     - `isFree`: Boolean indicating whether the bed is free.

2. **`Doctor_Sec51_G5`**:
   - Represents a doctor with attributes like ID, name, specialization, availability, and shift.
   - **Attributes**:
     - `id`: Unique identifier for the doctor.
     - `name`: Name of the doctor.
     - `specialization`: Field of expertise.
     - `isAvailable`: Boolean indicating whether the doctor is available.
     - `shift`: The doctor's assigned shift (`Shift_Sec51_G5`).

3. **`Patient_Sec51_G5`**:
   - Represents a patient with attributes like ID, name, age, severity level, assigned doctor, and bed.
   - **Attributes**:
     - `id`: Unique identifier for the patient.
     - `name`: Name of the patient.
     - `age`: Age of the patient.
     - `severityLevel`: Severity of the patient's condition (1-4).
     - `assignedDoctor`: Doctor assigned to the patient.
     - `assignedBed`: Bed assigned to the patient.

4. **`Shift_Sec51_G5`**:
   - Represents a shift for doctors with attributes like shift type, start time, and end time.

5. **`SeverityComparator_Sec51_G5`**:
   - Custom comparator to sort patients in a priority queue based on their severity level.

6. **`HospitalERManagementSystem_Sec51_G5`**:
   - Main class managing the entire system with methods for logging patients, assigning resources, updating information, and viewing hospital status.

---

## Usage Instructions

### Running the Program

1. Clone the repository and open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
2. Run the `HospitalERManagementSystem_Sec51_G5` class.
3. Follow the interactive menu to use the system.

### Main Menu Options

1. **Log a new patient check-in**: Add a new patient to the system with details like ID, name, age, and severity level.
2. **Update patient information**: Modify existing patient details.
3. **Assign a doctor to a patient**: Allocate an available doctor to a specific patient.
4. **Allocate a bed to a patient**: Assign a bed to a patient based on availability.
5. **Discharge a patient**: Remove a patient from the system and release assigned resources.
6. **View all patients in the queue**: Display patients sorted by severity level.
7. **Admin tools**: Access additional administrative functionalities, including viewing resources, adding doctors, and searching for patients.
0. **Quit**: Exit the program.

---

## Resource Management

### Doctors
- Doctors are managed in a **queue** to ensure efficient allocation.
- Shifts can be customized for each doctor (e.g., Day, Night).

### Beds
- Beds are stored in a **stack** to allow easy allocation and deallocation.

### Patients
- Patients are managed using a **priority queue**, sorted by their severity level:
  - 4: Critical
  - 3: Severe
  - 2: Moderate
  - 1: Mild

---

## Example Workflow

1. **Log a Patient**:
   - Enter patient details (ID, name, age, severity level).
   - The patient is added to the queue based on severity.

2. **Assign a Doctor**:
   - Provide the patient's ID and an available doctor's ID.
   - The doctor is marked as unavailable after assignment.

3. **Allocate a Bed**:
   - Provide the patient's ID and a bed ID.
   - The bed is marked as occupied after allocation.

4. **Discharge a Patient**:
   - Release the patient's assigned bed and doctor.
   - Remove the patient from the system.

---

## Developers

- **Lynn Abbidi** (ID: 1083873)
- **Aliya Haidar** (ID: 1082079)
