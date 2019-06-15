package Simulation;

import hla.rti.RTIambassador;
import hla.rti.RTIexception;

public class GUIFederate extends Federate {
    //----------------------------------------------------------
    //                      CONSTRUCTORS
    //----------------------------------------------------------

    public GUIFederate(RTIambassador rtiamb, String name, String federationName) {
        this.rtiamb = rtiamb;
        this.name = name;
        this.federationName = federationName;
    }

    //----------------------------------------------------------
    //                    INSTANCE METHODS
    //----------------------------------------------------------

    @Override
    protected void setAmbassador() { fedamb = new GUIAmbassador(this); }

    @Override
    protected void runFederateLogic() {

    }

    @Override
    protected void publishAndSubscribe() throws RTIexception {

    }
}
