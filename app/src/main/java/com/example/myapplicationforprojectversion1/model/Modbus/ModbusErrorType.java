package com.example.myapplicationforprojectversion1.model.Modbus;

/**
 * 常见的Modbus通讯错误
 */
public enum ModbusErrorType {
    ModbusError,
    ModbusFunctionNotSupportedError,
    ModbusDuplicatedKeyError,
    ModbusMissingKeyError,
    ModbusInvalidBlockError,
    ModbusInvalidArgumentError,
    ModbusOverlapBlockError,
    ModbusOutOfBlockError,
    ModbusInvalidResponseError,
    ModbusInvalidRequestError,
    ModbusTimeoutError
}

