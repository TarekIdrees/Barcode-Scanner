package com.tareq.domain

import com.tareq.repository.ScannerRepository
import javax.inject.Inject

class GetScanItemsUseCase @Inject constructor(
    private val scannerRepository: ScannerRepository
) {
    suspend operator fun invoke() = scannerRepository.getScanItems()
}