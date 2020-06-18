package pm.gnosis.safe.sdk.network.rpc.ethereum.models

import pm.gnosis.model.Solidity
import pm.gnosis.safe.sdk.network.models.Transaction
import java.math.BigInteger


data class TransactionData(
    val hash: String,
    val from: Solidity.Address,
    val transaction: Transaction,
    val transactionIndex: BigInteger?,
    val blockHash: String?,
    val blockNumber: BigInteger?
)
