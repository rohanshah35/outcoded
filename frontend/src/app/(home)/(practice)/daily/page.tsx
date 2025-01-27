"use client";

import DailyPage from "@/components/Practice/daily-page/daily-page";
import { ProblemProvider } from "@/components/Practice/ProblemData";

export default function Daily() {
  return (
    <ProblemProvider>
          <DailyPage />
    </ProblemProvider>
  );
}