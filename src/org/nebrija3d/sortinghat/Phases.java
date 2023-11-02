package org.nebrija3d.sortinghat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Phases {
    private String phaseKey = "0";
    private String optionOne = "";
    private String optionTwo = "";
    private String optionThree = "";
    private String mainOutput = "";

    public String optionOneAction() {
        return "null";
    }

    public String searchData(String dataToSearch) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);

            // Iterate through the phases
            for (JsonNode phase : rootNode) {
                JsonNode phaseArray = phase.get("phase");

                for (JsonNode phaseData : phaseArray) {
                    if (phaseData.get("phaseKey").asText().equals(targetPhaseKey)) {
                        // Check if the requested field exists
                        if (phaseData.has(fieldName)) {
                            return phaseData.get(fieldName).asText();
                        } else {
                            return "Field not found for " + fieldName;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Phases(String phaseKey) {
        this.phaseKey = phaseKey;
        this.optionOne = searchData("optionOne");
        this.optionTwo = searchData("optionTwo");
        this.optionThree = searchData("optionThree");
        this.mainOutput = searchData("mainOutput");
        System.out.println("Sei nella fase" + phaseKey);
    }
}