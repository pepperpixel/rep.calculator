import java.util.Scanner;

public class Choices extends App {
    int repChoice = 0;
    int humanRacialSelector = 0;
    String selectedRep = null;
    String selectedRacial = null;
    //String currentRepStage = null;
    int currentStandingValue = 0;
    String[] currentRepStage = {"Hated", "Hostile", "Unfriendly", "Neutral", "Friendly", "Honored", "Revered", "Exalted"};
    String[] currentRepStageSlashValue = {"/36000","/3000","/3000","/3000","/6000","/12000","/21000","/999"};
    protected String repStage = null;
    protected int repStanding = 0;
    protected boolean humanRacial;

    public void askForChoices() {

        Scanner repSelector = new Scanner(System.in);
        System.out.println("--Rep names--");
        System.out.println("1 - Timbermaw Hold");
        System.out.println("2 - Kurenai/Maghar");
        System.out.println("3 - Aldor/Scryers");
        repChoice = repSelector.nextByte();
        Scanner racialSelector = new Scanner(System.in);
        System.out.println("Human Racial");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        humanRacialSelector = racialSelector.nextByte();

        switch (repChoice) {
            case 1:
                selectedRep = "Timbermaw Hold";
            case 2:
                selectedRep = "Kurenai/Maghar";
            case 3:
                selectedRep = "Aldor/Scryers";
        }
        switch (humanRacialSelector) {
            case 1:
                selectedRacial = "Yes";
            case 2:
                selectedRacial = "No";
        }
        Scanner currentStage = new Scanner(System.in);
        System.out.println("Current Stage:");
        System.out.println(" 1 - Hated" + "\n 2 - Hostile" + "\n 3 - Unfriendly" + "\n 4 - Neutral" + "\n 5 - Friendly"
                + "\n 6 - Honored" + "\n 7 - Revered" + "\n 8 - Exalted");
        int currStageChoice = currentStage.nextByte();

        Scanner currentStanding = new Scanner(System.in);
        System.out.println("Current Standing:");
        currentStandingValue = currentStanding.nextInt();


        System.out.println("You selected {" + selectedRep + "} reputation. Diplomacy active?:" + selectedRacial
                + ". \n" + "Current stage: " + currentRepStage[currStageChoice-1] +
                "\n Current standing: " + currentStandingValue + currentRepStageSlashValue[currStageChoice-1]
                );

    }

    public void setRepStage(String repStage) {
        this.repStage = repStage;
    }

    public void setRepStanding(int repStanding) {
        this.repStanding = repStanding;
    }

    public void setHumanRacial(int humanRacialSelector){
        if (humanRacialSelector == 1){
            humanRacial = true;
        }
    }

    public int getRepChoice() {
        return repChoice;
    }

    public int getHumanRacialSelector() {
        return humanRacialSelector;
    }

    public String getSelectedRep() {
        return selectedRep;
    }

    public String getSelectedRacial() {
        return selectedRacial;
    }

    public int getCurrentStandingValue() {
        return currentStandingValue;
    }

    public String[] getCurrentRepStage() {
        return currentRepStage;
    }

    public String[] getCurrentRepStageSlashValue() {
        return currentRepStageSlashValue;
    }

    public String getRepStage() {
        return repStage;
    }

    public int getRepStanding() {
        return repStanding;
    }

    public boolean isHumanRacial() {
        return humanRacial;
    }

    public void setRepChoice(int repChoice) {
        this.repChoice = repChoice;
    }

    public void setHumanRacialSelector(int humanRacialSelector) {
        this.humanRacialSelector = humanRacialSelector;
    }

    public void setSelectedRep(String selectedRep) {
        this.selectedRep = selectedRep;
    }

    public void setSelectedRacial(String selectedRacial) {
        this.selectedRacial = selectedRacial;
    }

    public void setCurrentStandingValue(int currentStandingValue) {
        this.currentStandingValue = currentStandingValue;
    }

    public void setCurrentRepStage(String[] currentRepStage) {
        this.currentRepStage = currentRepStage;
    }

    public void setCurrentRepStageSlashValue(String[] currentRepStageSlashValue) {
        this.currentRepStageSlashValue = currentRepStageSlashValue;
    }
}
