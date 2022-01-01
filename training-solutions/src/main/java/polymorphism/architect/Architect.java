package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan planSketchPlan = new SketchPlan(25, "Vázlatterv");
        Plan planPermitPlan = new PermitPlan(
                45, "Engedélyterv", "planPermitPlanNév",
                "planPermitPlanCím");
        Plan planConstructionPlan = new ConstructionPlan(85, "Szerkezetterv",
                "planConstructionPlanNév", "planConstructionPlanCím",
                25);
        SketchPlan sketchPlan = new SketchPlan(15, "sketchPlanTitle");
        SketchPlan sketchPermit = new PermitPlan(10, "sketchPermitTitle",
                "sketchPermitNév", "SketchPermitCím");
        SketchPlan sketchConstruction = new ConstructionPlan(12, "sketchConstructTitle",
                "sketchConstructNév", "SketchconstructCím", 23);
        Header headerPermit = new PermitPlan(12, "headerPermitTitle",
                "headerPermitNév", "headerPermitCím");
        Header headerConstruct = new ConstructionPlan(32, "headerConstructTitle",
                "headerConstructNév", "headerConstrutCím", 45);
        PermitPlan permitPlan = new PermitPlan(45, "permitPlanTitle",
                "permitPlanNév", "permitPlanCím");
        PermitPlan permitConstruct = new ConstructionPlan(45, "permitConstructTitle",
                "permitConstructNév", "permitConstructCím", 23);
        ConstructionPlan constructionPlan = new ConstructionPlan(75, "constructionPlanTitle",
                "constructionPlanNév", "constructionPlanCím", 32);

        System.out.println(planSketchPlan.getPagesOfDocumentation());
        System.out.println(planPermitPlan.getPagesOfDocumentation());
        System.out.println(planConstructionPlan.getPagesOfDocumentation());
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPermit.getTitle());
        System.out.println(sketchPermit.getPagesOfDocumentation());
        System.out.println(sketchConstruction.getTitle());
        System.out.println(sketchConstruction.getPagesOfDocumentation());
        System.out.println(headerPermit.getNameOfClient());
        System.out.println(headerPermit.getAddressOfBuilding());
        System.out.println(headerConstruct.getNameOfClient());
        System.out.println(headerConstruct.getAddressOfBuilding());
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitConstruct.getTitle());
        System.out.println(permitConstruct.getPagesOfDocumentation());
        System.out.println(permitConstruct.getNameOfClient());
        System.out.println(permitConstruct.getAddressOfBuilding());
        System.out.println(permitConstruct.getHeader());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
    }
}
