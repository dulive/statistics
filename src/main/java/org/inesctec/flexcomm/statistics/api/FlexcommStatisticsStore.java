package org.inesctec.flexcomm.statistics.api;

import java.util.Collection;

import org.onosproject.net.DeviceId;
import org.onosproject.store.Store;

public interface FlexcommStatisticsStore extends Store<FlexcommStatisticsEvent, FlexcommStatisticsStoreDelegate> {

  FlexcommStatisticsEvent updateGlobalStatistics(DeviceId deviceId, GlobalStatistics globalStatistics);
  // FlexcommEvent updatePortStatistics(DeviceId deviceId,
  // Collection<PortStatistics> portStatistics);

  Collection<GlobalStatistics> getGlobalStatistics();

  Collection<GlobalStatistics> getGlobalDeltaStatistics();

  GlobalStatistics getGlobalStatistics(DeviceId deviceId);

  GlobalStatistics getGlobalDeltaStatistics(DeviceId deviceId);

  // Collection<PortStats> getPortStatistics();
  // Collection<PortStats> getPortDeltaStatistics();
  //
  // List<PortStats> getPortStatistics(DeviceId deviceId);
  // List<PortStats> getPortDeltaStatistics(DeviceId deviceId);
  //
  // PortStats getStatisticsForPort(DeviceId deviceId, PortNumber
  // portNumber);
  // PortStats getDeltaStatisticsForPort(DeviceId deviceId, PortNumber
  // portNumber);

  default void purgeStatistics(DeviceId deviceId) {
  }
}