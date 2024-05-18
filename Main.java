package ru.relex.Test_6_CW;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> programs = Deserialization.deserialize("data.txt");
        ArrayList<Program> allPrograms = ConvertDataToProgramClass.convertAllPrograms(programs);

        ArrayList<Program> sortedOfTimePrograms = Program.sortOfTime(allPrograms);
        ArrayList<Program> getProgramsThatInCurrentTime = Program.curProgram(allPrograms, "10:10");
        ArrayList<Program> getProgramsWithName = Program.getProgramsWithName(allPrograms, "Музыкальный майдан");
        ArrayList<Program> getProgramsWithCurrTimeAndChanelName = Program.getChanelNameAndCurTime(allPrograms, "08:00", "Карусель");
        ArrayList<Program> getProgramWithTimeBetweenAndChanel = Program.programBetween(allPrograms, "00:00", "03:00", "nickelodeon");

        Serialization writer = new Serialization(sortedOfTimePrograms, "programs.xlsx");
        Serialization.saveToExcel(sortedOfTimePrograms, "programs.xlsx");

    }
}
