package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */

public class TrainingEvaluation {
    private int Tieuchi1;
    private int Tieuchi2;
    private int Tieuchi3;
    private int Tieuchi4;
    private int Tieuchi5;
    
    public TrainingEvaluation(int Tieuchi1, int Tieuchi2,int Tieuchi3,int Tieuchi4,int Tieuchi5) {
        this.Tieuchi1 = Tieuchi1;
        this.Tieuchi2 = Tieuchi2;
        this.Tieuchi3 = Tieuchi3;
        this.Tieuchi4 = Tieuchi4;
        this.Tieuchi5 = Tieuchi5;
    }

    public int getTieuchi1() {
        return Tieuchi1;
    }

    public void setTieuchi1(int Tieuchi1) {
        this.Tieuchi1 = Tieuchi1;
    }

    public int getTieuchi2() {
        return Tieuchi2;
    }

    public void setTieuchi2(int Tieuchi2) {
        this.Tieuchi2 = Tieuchi2;
    }

    public int getTieuchi3() {
        return Tieuchi3;
    }

    public void setTieuchi3(int Tieuchi3) {
        this.Tieuchi3 = Tieuchi3;
    }

    public int getTieuchi4() {
        return Tieuchi4;
    }

    public void setTieuchi4(int Tieuchi4) {
        this.Tieuchi4 = Tieuchi4;
    }

    public int getTieuchi5() {
        return Tieuchi5;
    }

    public void setTieuchi5(int Tieuchi5) {
        this.Tieuchi5 = Tieuchi5;
    }
    
    public int calculateScore() {
        int Score = Tieuchi1 + Tieuchi2 + Tieuchi3 + Tieuchi4 + Tieuchi5;
        return Score;
    }
    
    public String evaluateTraining() {
        double Score = calculateScore();
        if (Score >= 90) {
            return "Xuất sắc";
        } else if (Score >= 80) {
            return "Tốt";
        } else if (Score >= 70) {
            return "Khá";
        }else if (Score >= 60) {
            return "Trung bình";} 
        else {
            return "Yếu";
        }
    }
}
