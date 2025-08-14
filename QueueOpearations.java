import java.util.*;

class Patient {
    String name;
    int severity;
    int arrivalOrder;

    public Patient(String name, int severity, int arrivalOrder) {
        this.name = name;
        this.severity = severity;
        this.arrivalOrder = arrivalOrder;
    }
}

public class QueueOpearations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        // PriorityQueue with capacity 10 and custom comparator
        PriorityQueue<Patient> pq = new PriorityQueue<Patient>(10, new Comparator<Patient>() {
            public int compare(Patient a, Patient b) {
                if (b.severity != a.severity) {
                    return b.severity - a.severity; // higher severity first
                } else {
                    return a.arrivalOrder - b.arrivalOrder; // earlier arrival first
                }
            }
        });

        int arrivalCounter = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String command = input[0];

            if (command.equalsIgnoreCase("ENQUEUE")) {
                String name = input[1];
                int severity = Integer.parseInt(input[2]);
                pq.offer(new Patient(name, severity, arrivalCounter++));
            } 
            else if (command.equalsIgnoreCase("DEQUEUE")) {
                if (pq.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Patient treated = pq.poll();
                    System.out.println("Treated Patient: " + treated.name);
                }
            } 
            else if (command.equalsIgnoreCase("DISPLAY")) {
                if (pq.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    List<Patient> tempList = new ArrayList<Patient>(pq);
                    Collections.sort(tempList, new Comparator<Patient>() {
                        public int compare(Patient a, Patient b) {
                            if (b.severity != a.severity) {
                                return b.severity - a.severity;
                            } else {
                                return a.arrivalOrder - b.arrivalOrder;
                            }
                        }
                    });

                    System.out.print("Current Queue: ");
                    for (int j = 0; j < tempList.size(); j++) {
                        Patient p = tempList.get(j);
                        System.out.print(p.name + "(" + p.severity + ")");
                        if (j != tempList.size() - 1) System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
