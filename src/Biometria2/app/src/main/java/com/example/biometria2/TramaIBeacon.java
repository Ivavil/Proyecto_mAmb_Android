package com.example.biometria2;


import java.util.Arrays;

// -----------------------------------------------------------------------------------
// @author: Ivan Villanueva Villalon
// -----------------------------------------------------------------------------------
public class TramaIBeacon {
    private byte[] prefijo = null; // 9 bytes
    private byte[] uuid = null; // 16 bytes
    private byte[] major = null; // 2 bytes
    private byte[] minor = null; // 2 bytes
    private byte txPower = 0; // 1 byte

    private byte[] losBytes;

    private byte[] advFlags = null; // 3 bytes
    private byte[] advHeader = null; // 2 bytes
    private byte[] companyID = new byte[2]; // 2 bytes
    private byte iBeaconType = 0 ; // 1 byte
    private byte iBeaconLength = 0 ; // 1 byte

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Prefix getter
     * getPrefijo() -> [Byte]
     *
     *
     * @return Beacon prefix
     */
    public byte[] getPrefijo() {
        return prefijo;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * UUID getter
     * getUUID() -> [Byte]
     *
     *
     * @return Beacon UUID
     */
    public byte[] getUUID() {
        return uuid;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Major value getter
     * getMajor() -> [Byte]
     *
     *
     * @return Beacon major value
     */
    public byte[] getMajor() {
        return major;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Minor value getter
     * getMinor() -> [Byte]
     *
     *
     * @return Beacon minor value
     */
    public byte[] getMinor() {
        return minor;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Tx Power getter
     * getTxPower() -> Byte
     *
     *
     * @return Beacon Tx Power
     */
    public byte getTxPower() {
        return txPower;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * all Bytes getter
     * getLosBytes() -> [Byte]
     *
     *
     * @return all the bytes that form the Beacon.
     */
    public byte[] getLosBytes() {
        return losBytes;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Adv Flags getter
     * getAdvFlags() -> [Byte]
     *
     *
     * @return Beacon Adv Flags.
     */
    public byte[] getAdvFlags() {
        return advFlags;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Adv Header getter
     * getAdvHeader() -> [Byte]
     *
     *
     * @return Beacon Adv Header.
     */
    public byte[] getAdvHeader() {
        return advHeader;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Company ID getter
     * getCompanyID() -> Byte
     *
     *
     * @return Company ID.
     */
    public byte[] getCompanyID() {
        return companyID;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Beacon type getter
     * getiBeaconType() -> Byte
     *
     *
     * @return Beacon type
     */
    public byte getiBeaconType() {
        return iBeaconType;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * Beacon length getter
     * getiBeaconLength() -> Byte
     *
     *
     * @return Beacon length.
     */
    public byte getiBeaconLength() {
        return iBeaconLength;
    }

    // -------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------
    /*
     * The constructor of the class
     * [Byte] -> TramaIBeacon()
     *
     * @param bytes Bytes that form the Beacon data
     *
     */
    public TramaIBeacon(byte[] bytes ) {
        this.losBytes = bytes;

        prefijo = Arrays.copyOfRange(losBytes, 0, 8+1 ); // 9 bytes
        uuid = Arrays.copyOfRange(losBytes, 9, 24+1 ); // 16 bytes
        major = Arrays.copyOfRange(losBytes, 25, 26+1 ); // 2 bytes
        minor = Arrays.copyOfRange(losBytes, 27, 28+1 ); // 2 bytes
        txPower = losBytes[ 29 ]; // 1 byte

        advFlags = Arrays.copyOfRange( prefijo, 0, 2+1 ); // 3 bytes
        advHeader = Arrays.copyOfRange( prefijo, 3, 4+1 ); // 2 bytes
        companyID = Arrays.copyOfRange( prefijo, 5, 6+1 ); // 2 bytes
        iBeaconType = prefijo[ 7 ]; // 1 byte
        iBeaconLength = prefijo[ 8 ]; // 1 byte

    } // ()
} // class
// -----------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------



