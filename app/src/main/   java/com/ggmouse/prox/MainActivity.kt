   package com.ggmouse.prox

   import android.accessibilityservice.AccessibilityService
   import android.accessibilityservice.GestureDescription
   import android.graphics.Path
   import android.view.accessibility.AccessibilityEvent

   class GGMouseService : AccessibilityService() {
       
       override fun onAccessibilityEvent(event: AccessibilityEvent?) {
           // Servicio activo - aquí iría la lógica del mouse
       }

       override fun onInterrupt() {
           // Servicio interrumpido
       }
       
       override fun onServiceConnected() {
           super.onServiceConnected()
           // Servicio conectado correctamente
       }
   }
