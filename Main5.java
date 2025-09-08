class Admission {
    void admissionProcess() {
        System.out.println("General Admission Process");
    }
}

class UndergraduateAdmission extends Admission {
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

class PostgraduateAdmission extends Admission {
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Admission a1 = new UndergraduateAdmission();
        Admission a2 = new PostgraduateAdmission();
        a1.admissionProcess();
        a2.admissionProcess();
    }
}
