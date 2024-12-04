public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    //getter
    public ExpeditionMember getExpeditionLeader() {
        return expeditionLeader;
    }
    public ExpeditionMember getArchivist() {
        return archivist;
    }
    public ExpeditionMember getFieldResearcher() {
        return fieldResearcher;
    }

    public String toString() {
        return "Expedition Leader: " + expeditionLeader + "\n" + "Archivist: " + archivist + "\n" + "Field Researcher: " + fieldResearcher;
    }
}
