package jquiros.configclient.custom;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HealthCheck  implements HealthCheckHandler{

    private int counter = -1;

    @Override
    @RequestMapping(value = "/my_health")
    public InstanceStatus getStatus (InstanceStatus currentStatus){
        counter ++;

        switch (counter%5){
            case 0:
                return InstanceStatus.OUT_OF_SERVICE;
            case 1:
                return InstanceStatus.DOWN;
            case 2:
                return InstanceStatus.STARTING;
            case 3:
                return InstanceStatus.UNKNOWN;
            case 4:
            default:
                return InstanceStatus.UP;
        }
    }
}
