package com.stmarkssolutions.aws.cli.vpc.model.describe.vpnconnections

case class TunnelOption(OutsideIpAddress: Option[String],
                        TunnelInsideCidr:Option[String],
                        PreSharedKey:Option[String],
                        Phase1LifetimeSeconds:Option[Int],
                        Phase2LifetimeSeconds:Option[Int],
                        RekeyMarginTimeSeconds:Option[Int],
                        RekeyFuzzPercentage:Option[Int],
                        ReplayWindowSize:Option[Int],
                        DpdTimeoutSeconds:Option[Int],
                        Phase1EncryptionAlgorithms:Option[List[Phase1EncryptionAlgorithm]],
                        Phase2EncryptionAlgorithms:Option[List[Phase2EncryptionAlgorithm]],
                        Phase1IntegrityAlgorithms:Option[List[Phase1IntegrityAlgorithm]],
                        Phase2IntegrityAlgorithms:Option[List[Phase2IntegrityAlgorithm]],
                        Phase1DHGroupNumbers:Option[List[Phase1DHGroupNumber]],
                        Phase2DHGroupNumbers:Option[List[Phase2DHGroupNumber]],
                        IkeVersions: Option[List[IkeVersion]]
                       )


case class Phase1EncryptionAlgorithm(Value:String)

case class Phase2EncryptionAlgorithm(Value:String)

case class Phase1IntegrityAlgorithm(Value:String)

case class Phase2IntegrityAlgorithm(Value:String)

case class Phase1DHGroupNumber(Value:String)

case class Phase2DHGroupNumber(Value:String)

case class IkeVersion(Value:String)