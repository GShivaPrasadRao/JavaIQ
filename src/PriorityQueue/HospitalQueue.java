package PriorityQueue;

import java.util.PriorityQueue;

//Example code for Priority Queue
class Patient implements Comparable<Patient> {
    String name;
    int severity; // Higher value means higher priority

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Max-Heap: Higher severity first
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>();

        // Adding patients with different severity levels
        hospitalQueue.add(new Patient("Alice", 2));
        hospitalQueue.add(new Patient("Bob", 5));
        hospitalQueue.add(new Patient("Charlie", 3));
        hospitalQueue.add(new Patient("David", 4));

        System.out.println("Patients in Priority Order:");

        while (!hospitalQueue.isEmpty()) {
            System.out.println("Treating: " + hospitalQueue.poll()); // Highest severity first
        }
    }
}
