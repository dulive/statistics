package org.inesctec.flexcomm.statistics.api;

import java.util.Collection;

import org.onosproject.net.DeviceId;
import org.onosproject.net.provider.ProviderService;

public interface FlexcommStatisticsProviderService extends ProviderService<FlexcommStatisticsProvider> {

  void updateGlobalStatistics(DeviceId deviceId, GlobalStatistics globalStatistics);

  void updatePortStatistics(DeviceId deviceId, Collection<PortStatistics> portStatistics);

}
