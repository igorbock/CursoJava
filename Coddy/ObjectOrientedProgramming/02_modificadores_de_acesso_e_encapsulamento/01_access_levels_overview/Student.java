class Student {
    // TODO: Defina os quatro campos com diferentes modificadores de acesso:
    // - private: studentId (String)
    // - default (sem modificador): grade (int)
    // - protected: name (String)
    // - public: school (String)
    private String studentId;
    int grade;
    protected String name;
    public String school;
    
    // TODO: Crie um construtor que receba todos os quatro parâmetros
    // e inicialize todos os campos
    public Student(String studentId, String name, int grade, String school) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.school = school;
    }
    
    // TODO: Implemente o método getInfo() que retorna:
    // "[studentId] name - Grade grade at school"
    public String getInfo() {
        return "[" + this.studentId + "]" + " " + this.name + " - Grade " + this.grade + " at " + this.school; 
    }
}
