class Student {
    // TODO: Declare um campo final para studentId (String)
    private final String studentId;

    // TODO: Declare um campo final para enrollmentYear (int)
    private final int enrollmentYear;
    
    // TODO: Declare um campo private para name (String) - este NÃO é final
    private String name;
    
    // TODO: Crie um construtor que receba studentId, name e enrollmentYear
    // e inicialize todos os campos
    public Student(String studentId, String name, int enrollmentYear) {
        this.studentId = studentId;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }
    
    // TODO: Crie o getter getStudentId()
    public String getStudentId() {
        return this.studentId;
    }
    
    // TODO: Crie o getter getEnrollmentYear()
    public int getEnrollmentYear() {
        return this.enrollmentYear;
    }
    
    // TODO: Crie o getter getName()
    public String getName() {
        return this.name;
    }
    
    // TODO: Crie o setter setName(String name)
    public void setName(String name) {
        this.name = name;
    }
    
    // TODO: Crie o método getInfo() que retorna:
    // "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
    public String getInfo() {
        return "ID: " + this.studentId + " | Name: " + this.name +" | Enrolled: " + this.enrollmentYear;
    }
}
