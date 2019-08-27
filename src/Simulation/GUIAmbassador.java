package Simulation;

import hla.rti.*;
import hla.rti.jlc.EncodingHelpers;
import model.Interaction;

public class GUIAmbassador extends Ambassador {
    //----------------------------------------------------------
    //                      CONSTRUCTORS
    //----------------------------------------------------------


    public GUIAmbassador(GUIFederate federate) {
        this.federate = federate;
    }

    @Override
    public void receiveInteraction(int interactionClass, ReceivedInteraction theInteraction, byte[] tag, LogicalTime theTime, EventRetractionHandle eventRetractionHandle) {
        try {
            String interactionName = federate.rtiamb.getInteractionClassName(interactionClass);
            switch(interactionName) {
                case Interaction.NEW_CAR_APPEARED : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    String oil = EncodingHelpers.decodeString(theInteraction.getValue(1));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    //TODO: Wywołanie metody
                }
                case Interaction.NEW_CAR_AT_DISPENSER_QUEUE : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    String oil = EncodingHelpers.decodeString(theInteraction.getValue(1));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    //TODO: Wywołanie metody
                }
                case Interaction.DISPENSER_AVAILABLE : {
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody
                }
                case Interaction.OCCUPY_DISPENSER : {
                    int idCash = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    String oil = EncodingHelpers.decodeString(theInteraction.getValue(1));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(3)));
                    //TODO: Wywołanie metody
                }
                case Interaction.PUMPING_ENDED : {
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(1)));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    //TODO: Wywołanie metody
                }
                case Interaction.NEW_CAR_AT_CASH_BOX_QUEUE : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(1)));
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    //TODO: Wywołanie metody
                }
                case Interaction.CASH_BOX_AVAILABLE : {
                    int idCash = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody
                }
                case Interaction.OCCUPY_CASH_BOX : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    int idCash = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(1)));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(3)));
                    //TODO: Wywołanie metody
                }
                case Interaction.PAYMENT_DONE : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    int idCash = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(1)));
                    int idDistributor = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(2)));
                    boolean isWashing = Boolean.parseBoolean(EncodingHelpers.decodeString(theInteraction.getValue(3)));
                    //TODO: Wywołanie metody
                }
                case Interaction.NEW_CAR_AT_CAR_WASH_QUEUE : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody
                }
                case Interaction.CAR_WASH_AVAILABLE : {
                    //TODO: Wywołanie metody
                }
                case Interaction.CAR_WASH_OCCUPIED : {
                    int idCash = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody

                }
                case Interaction.CAR_WASH_RELEASED : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody
                }
                case Interaction.LEAVE_SIMULATION : {
                    int idCar = Integer.parseInt(EncodingHelpers.decodeString(theInteraction.getValue(0)));
                    //TODO: Wywołanie metody
                }
            }

        } catch (InteractionClassNotDefined | RTIinternalError | FederateNotExecutionMember | ArrayIndexOutOfBounds interactionClassNotDefined) {
            interactionClassNotDefined.printStackTrace();
        }

    }
}
